# Tic-Tac-Toe (Java)

## Description
This is a simple command-line Tic-Tac-Toe game implemented in Java. The game allows two players to take turns placing their marks (X and O) on a 3x3 board until there is a winner or the board is full (draw).

## Features
- Two-player mode (alternating turns)
- Board display after each move
- Input validation to ensure valid moves
- Win and draw detection
- Option to start a new game after completion

## Technologies Used
- Java

## How to Play
1. Run the program in a terminal or an IDE that supports Java execution.
2. Players take turns choosing a row and column (1-3) to place their mark.
3. The game checks for a winner or a draw after each move.
4. If there is a winner or a draw, the game ends and asks if you want to start a new game.

## How to Run
1. Clone the repository or download the source code.
2. Compile the Java files using:
   ```sh
   javac *.java
   ```
3. Run the game using:
   ```sh
   java Player
   ```

## Example Gameplay
```
   1 | 2 | 3
  ---|---|---
   4 | 5 | 6
  ---|---|---
   7 | 8 | 9

Player X, enter row (1-3): 1
Player X, enter column (1-3): 1

   X |   |  
  ---|---|---
     |   |  
  ---|---|---
     |   |  
...
```

## Future Improvements
- Add a single-player mode with AI
- Implement a graphical user interface (GUI)

