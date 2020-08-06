# TeamE3DungeonCrawler
Final battle royale project

Basic instructions on use:

This game is a dungeon-crawler rpg with the implementation of a basic in-text map and a graphical user interface mode
to run the game in the terminal, simply execute the "main" class file found in the repository. To run the game
from here, you will be prompted whether to start the game.

To run the game in GUI mode, run the "guimain" class.

Text Mode:

When shown the map, keep in mind the following legend:

@: this is the player marker and shows your current position

$: this is an enemy marker, showing the position of an enemy

. : this dot represents a space that the player can move to in the map

#: this is an impassible wall. They are found on the periphery of the map and throughout it

To move around the map, you must type out the direction you want to move, ie "right", and press enter
on the keyboard. You should see the @ symbol move in the direction you specified, unless you are moving
into a wall

You can open the inventory or stats menu by typing out those options. In the inventory menu, you can type equip or unequip to change your equipment. After entering equip/unequip, you can enter the number of the inventory slot to equip/unequip that item. Make sure to equip a weapon, armor, health potion, and stamina potion before combat, or the game will crash.

To start combat, move onto the same space occupied by the $ sign representing an enemy. You will then
be presented with the combat menu, prompting you to start combat. Combat is done in rounds, where each round you can choose to use a potion, flee, or select an amount of stamina to expend for your attack. Type a number between 1-current stamina level to attack. If you use more stamina to attack than your enemy, you will deal damage, and vice versa. If you use less stamina on your turn, you may regenerate some stamina for next turn.
To quit the game, type "quit" while in the map

GUI Mode:

When you run the game you will immediately be taken into the game. On the right side there are inventory and stats tabs. To equip/unequip items, just click the buttons in the inventory. To refresh the health bar displayed in inventory, hit the "beta refresh" button. To move around, press the arrow buttons. Initialize combat by stepping onto the skeleton and pressing the arrow button again. A combat window will appear. To attack, slide the slider to the desired stamina expenditure and click go. Once combat has ended, close the combat window by pressing x and return to the map window.