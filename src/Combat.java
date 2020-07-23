import java.util.Random;
import java.util.Scanner;
public class Combat {
	
	private int playersRemainingHP;
	private int enemysRemainingHP;
	private String enemyName;
	private Enemy combatEnemy;
	private Player combatPlayer;
	private Userinterface consoleClear;

	public Combat() {
		
	}
	
	public int getEnemysCurrentHP() {
		return enemysRemainingHP;
	}
	
	public int getPlayersCurrentHP() {
		return playersRemainingHP;
	}

	public void combatInit(Enemy enemy, Player player) {
		
		combatEnemy = enemy;
		combatPlayer = player;
		enemyName = enemy.getName();
		enemysRemainingHP = enemy.getHp();
		playersRemainingHP = player.getHp();
		Scanner init = new Scanner(System.in);
		System.out.println("You have encountered a " + enemyName + "!" + "\n");
		System.out.println("The " + enemyName + " acts with hostile intent, but you still have time to run" + "\n");
		System.out.println("What do you wish to do? (Enter one):" + "\n" + "1: Fight!" + "\n" + "2: Flee!" + "\n");
		int decision = init.nextInt();
		
		if (decision == 1) {
			System.out.println("You ready your weapon, prepared to stand your ground..." + "\n");
			combatRun(enemy, player);
		} else if (decision == 2) {
			System.out.println("You step back cautiously, determined to avoid trouble");
		}
	
	}
	
	public void combatRun(Enemy enemy, Player player) {
		
		Scanner invSelc = new Scanner(System.in);
		Inventory p1 = new Inventory("p1");
		p1.addToInv(p1, p1.getIronSword());
		p1.getInventory();
		System.out.println("Choose your weapon..." +"\n");
		System.out.println("Select an inventory slot (Enter one): " + "\n");
		int weaponDecision = invSelc.nextInt();
		int weaponDamage = p1.getInvList()[weaponDecision].getDamage();
		String weaponName = p1.getInvList()[weaponDecision].getName();
		
		Random rand = new Random();
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		System.out.println("FIGHT!" + "\n" + "You and the " + enemyName + " close in on each other, poised to attack...");
		boolean quit = false;
		Scanner playerMove = new Scanner(System.in);
		int enemyMove;
		
		while (quit == false) {
			System.out.println(enemyName + "'s remaining hit points: " + enemysRemainingHP + "\n");
			System.out.println("Your remaining hit points: " + playersRemainingHP + "\n");
			System.out.println("Choose your next move:" + "\n");
			System.out.println("1: Heavy attack" + "\n" + "2: Light attack" + "\n" + "3: Block" + "\n" + "4: Flee");
			int playermoveDecision = playerMove.nextInt();
			enemyMove = rand.nextInt(3) + 1;
			
			consoleClear = new Userinterface();
			consoleClear.clearConsole();
			
			if (playermoveDecision == 1 && enemyMove == 1) {
				System.out.println("You strike agressively with your " + weaponName +  ", but the " + enemyName + " does the same!" + "\n");
				System.out.println("Your ferocious blows cancel each other out, and you each recoil to reset your posture..." + "\n");
			}
			
			else if (playermoveDecision == 2 && enemyMove == 2) {
				System.out.println("You make a cautious attack, prodding the " + enemyName + "'s defenses." + "\n");
				System.out.println("They do the same, deflecting your prods with quick, light motions." + "\n");
			}
			
			else if (playermoveDecision == 3 && enemyMove == 3) {
				System.out.println("You and the " + enemyName + " each take a defensive position, eyeing each other's movements..." + "\n");
			}
			
			else if (playermoveDecision == 1 && enemyMove == 2) {
				System.out.println("You make a heavy strike against the " + enemyName + "\n");
				System.out.println("The " + enemyName + " makes a light jab, but is overpowered by your agressive blow, taking " + weaponDamage  +" damage!" + "\n");
				enemysRemainingHP -= weaponDamage;
			}
			
			else if (playermoveDecision == 1 && enemyMove == 3) {
				System.out.println("You make a heavy strike against the " + enemyName + ", but they fall into a defensive block, deflecting your " + weaponName + "!" + "\n");
				System.out.println("While off-balance, the " + enemyName + " counterstrikes you, dealing 2 damage!" + "\n");
				playersRemainingHP -= 2;
			}
			
			else if (playermoveDecision == 2 && enemyMove == 1) {
				System.out.println("You make a cautious attack, prodding the " + enemyName + "'s defenses." + "\n");
				System.out.println("However, the " + enemyName + " makes a powerful strike, overpowering you and dealing 2 damage!" + "\n");
				playersRemainingHP -= 2;
			}
			
			else if (playermoveDecision == 2 && enemyMove == 3) {
				System.out.println("You make a cautious attack, prodding the " + enemyName + "'s defenses." + "\n");
				System.out.println("The " + enemyName + " falls into a defensive position, but your careful attack finds a weak spot!" + "\n");
				System.out.println("You strike the " + enemyName + " in its weak spot, dealing 5 damage!" + "\n");
				enemysRemainingHP -= weaponDamage;
			}
			
			else if (playermoveDecision == 3 && enemyMove == 1) {
				System.out.println("You fall into a defensive stance, prepared to block" + "\n");
				System.out.println("The " + enemyName + " makes a strong attack, but you deflect its blow and quickly counterstrike, dealing 5 damage!" + "\n");
				enemysRemainingHP -= weaponDamage;
			}
			
			else if (playermoveDecision == 3 && enemyMove == 2) {
				System.out.println("You fall into a defensive stance, prepared to block" + "\n");
				System.out.println("The " + enemyName + " makes a careful jab, using finesse to aim through your defense" + "\n");
				System.out.println("The " + enemyName + " strikes you in your weak spot, dealing 5 damage!" + "\n");
			}
			
			else if (playermoveDecision == 4) {
				System.out.println("You break off your attack and flee, having overestimated your combat abilities" + "\n");
				System.out.println("As you turn and run, the " + enemyName + " takes the opportunity to deliver a parting blow, dealing 2 damage!" + "\n");
				playersRemainingHP -= 2;
				quit = true;
			}
			
			if (playersRemainingHP <= 0) {
				playersRemainingHP = 0;
				quit = true;
			}
			if (enemysRemainingHP <= 0) {
				enemysRemainingHP = 0;
				quit = true;
			}
		}
		
		combatEnd(enemy, player);
	}
	
	public void combatEnd(Enemy enemy, Player player) {
		
		if (playersRemainingHP == 0) {
			System.out.println("You were defeated by the " + enemyName + "!" + "\n");
			//System.out.println(enemyName + "'s remaining hit points: " + enemysRemainingHP + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(0);
			enemy.setHp(enemysRemainingHP);
			System.out.println("Quitting...");
			System.exit(0);
		}
		
		if (enemysRemainingHP == 0) {
			System.out.println("You have vanquished the " + enemyName + "!" + "\n");
			System.out.println("Your remaining hit points: " + playersRemainingHP);
			System.out.println("XP gained: " + combatEnemy.getGivesXP());
			System.out.println("Coins gained: " + combatEnemy.getGivesCoin() + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(playersRemainingHP);
			enemy.setHp(0);
			player.setXp(combatPlayer.getXp() + combatEnemy.getGivesXP());
			player.setCoins(combatPlayer.getCoins() + combatEnemy.getGivesCoin());
			player.setKillCount(player.getKillCount() +1);
			enemy.setDead(true);
		}
		
		if (enemysRemainingHP > 0 && playersRemainingHP > 0) {
			System.out.println("You fled from the fight and survived!" + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(playersRemainingHP);
			enemy.setHp(enemysRemainingHP);
		}
		
	}
	
}

