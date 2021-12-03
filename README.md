# SnakesAndLadders

---
## This is an LLD problem with the following requirements

---

## Design the game of Snakes & Ladders

- Create a Snake and Ladder Application.
- The application should take input n from the user.
- The game should have a board of size nxn.
- There should be n snakes and n ladders placed randomly on the board.
- Each snake will have its head at some number and its tail at a smaller number.
- Each ladder will have its start position at some number and end position at a larger number.
- There can be multiple players in the game.

---

## Rules of the game

---

- The board has numbers from 1 to nxn.
- The players will make there moves turn by turn.
- The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
- Each player has a piece which is initially kept outside the board (or at position 0).
- Each player rolls the dice when their turn comes.
- Based on the dice value, the player moves their piece forward by that many number of cells. Ex:- If the dice value is 4 and the player was at position 8, then the player will move to the position 12 (8+4).
- A player wins if he reached the last cell in the board.
- Whenever a player ends up at a cell with the head of the snake, the player should go down to the cell that has the tail of that snake.
- Whenever a player ends up at a cell with the start of the ladder, the player should go up to the cell that has the end of that ladder.
- The game should continue till there are at least 2 players still playing to win.
- After the dice roll, if a piece is supposed to move outside position of the board size, it does not move.
- Snakes and Ladders do not create any cycle.

---

## Future Scope

---

- The game can be played by more than one dice (Ex:- If there are 4 dices then the numbers from 4 to 24 can be generated in any roll).
- On getting a max roll of the dice for 3 consecutive turns, all 3 of those turns get cancelled.

---

The entities that can be thought of for the above problem are:
- User/Player
- Game
- Board
- BoardEntity (Abstract Class)
- Snake
- Ladder

---

# Class Diagram
![Alt text](./SnakesAndLadders_ClassDiagram.jpg?raw=true "Class Diagram")