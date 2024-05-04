# Magical Arena Game

## Overview

The Magical Arena Game is a Java-based console application that simulates turn-based battles between two players in a magical arena setting. Each player is characterized by their health, strength, and attack attributes. The game continues until one player's health reaches zero, determining the winner.

## Classes

1. **Main:** This class serves as the entry point for the game. It initializes the game by creating two player objects and starting the game loop.

2. **Game:** The `Game` class contains the main logic of the game. It manages player turns, executes attacks, and determines the outcome of each battle.

3. **Player:** Representing each participant in the game, the `Player` class encapsulates attributes such as health, strength, and attack power. It also includes methods for defending against attacks and inflicting damage on opponents.

4. **Dice:** The `Dice` class simulates the rolling of a six-sided die, used to calculate random outcomes during attacks.

## How to Run

To run the Magical Arena Game:

1. Ensure you have Java Development Kit (JDK) installed on your system.

2. Navigate to the project directory containing the Java files.

3. Compile all Java files in the project using the following command:

      `javac *.java`

4. Run the game by executing the Main class with the following command:

      `java Main`

## Output

Upon running the game, you will see a series of console outputs representing the progress of the battle. Each step displays the actions taken by the players, including attacks, defenses, and changes in health points.

![Screenshot (50)](https://github.com/anushkasinha126/magical-arena/assets/73252825/3725295d-4009-4181-9c4d-65292aa6049e)

![Screenshot (51)](https://github.com/anushkasinha126/magical-arena/assets/73252825/29f66a75-fe68-4682-ba2b-1e76b7c4f8fa)


## Additional Notes

- The game follows a simple turn-based combat system, where players alternate between attacking and defending.
- Players take turns rolling dice to determine the outcome of their attacks and defenses.
- The game continues until one player's health drops to zero, declaring the other player as the victor.

## Commit Log

![Screenshot (49)](https://github.com/anushkasinha126/magical-arena/assets/73252825/5df322c3-e6a6-4ed4-8b7a-86f5bc473f5c)

![Screenshot (53)](https://github.com/anushkasinha126/magical-arena/assets/73252825/ebeb6017-f5f4-4700-9a2d-e06d9b12d13f)

## Tests
 
![Screenshot (48)](https://github.com/anushkasinha126/magical-arena/assets/73252825/abdb758d-5f79-4a02-b6a2-9f209f5aab3c)

