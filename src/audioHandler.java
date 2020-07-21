import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class audioHandler {
// sources: https://www.youtube.com/watch?v=TErboGLHZGA
//          https://www.codota.com/code/java/classes/javax.sound.sampled.Clip 
	
	// Source: https://github.com/kevin-wayne/algs4/tree/master/src/main/java/edu/princeton/cs/algs4/StdAudio.java#L354
	//public void play(String musicLocation) {
		/**
		 * Loops an audio file (in .wav, .mid, or .au format) in a background thread.
		 *
		 * @param filename the name of the audio file
		 * @throws IllegalArgumentException if {@code filename} is {@code null}
		 */
	public static synchronized Clip loop(String musicLocation) {
		  if (musicLocation == null) throw new IllegalArgumentException();
		  // code adapted from: http://stackoverflow.com/questions/26305/how-can-i-play-sound-in-java
		  try {
		    Clip clip = AudioSystem.getClip();
		    InputStream is = audioHandler.class.getResourceAsStream(musicLocation);
		    AudioInputStream ais = AudioSystem.getAudioInputStream(is);
		    clip.open(ais);
		    
		    FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		    float range = gainControl.getMaximum() - gainControl.getMinimum();
		    float gain = (range * 0.75f) + gainControl.getMinimum();
		    gainControl.setValue(gain);
		    
		    clip.loop(Clip.LOOP_CONTINUOUSLY);
		    return clip;
		  }
		  catch (UnsupportedAudioFileException e) {
		    throw new IllegalArgumentException("unsupported audio format: '" + musicLocation + "'", e);
		  }
		  catch (LineUnavailableException e) {
		    throw new IllegalArgumentException("could not play '" + musicLocation + "'", e);
		  }
		  catch (IOException e) {
		    throw new IllegalArgumentException("could not play '" + musicLocation + "'", e);
		  }
		  
	} 
	
	public static void stop(Clip clip) {
	  clip.stop();
	  clip.flush();
	  clip.close();
	}
}


