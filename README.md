# Conway’s Game of Life (Java - SaOOP Project 1)

A simple Java implementation of **Conway’s Game of Life**, created as part of the SaOOP Project #1.  
This version covers **Stages 1–4** of the assignment:
- 2D array board
- Basic Game of Life rules
- Console visualisation
- Fixed number of generations

No Stage 5 improvements (GUI, wrap-around, etc.) are included — this is the simplest working version.

---

## 🎯 Project Overview

Conway’s Game of Life is a **cellular automaton** devised by mathematician John Conway.  
Each cell on the board is either **alive** or **dead**, and its state in the next generation depends on the number of living neighbours.

### Rules

1. Any live cell with fewer than 2 live neighbours dies (underpopulation).  
2. Any live cell with 2 or 3 live neighbours lives on.  
3. Any live cell with more than 3 live neighbours dies (overpopulation).  
4. Any dead cell with exactly 3 live neighbours becomes alive (reproduction).

---

## 🧩 Project Structure

- ├── Main.java # Program entry point (controls game loop)
- ├── Board.java # Board representation and display logic
- └── GameOfLife.java # Game logic: neighbour counting & next generation

---

## ⚙️ How It Works

1. **Main.java**  
   - Creates a board (default: 20 × 40)  
   - Randomly fills cells (30% alive)  
   - Runs a fixed number of generations (default: 200)  
   - Prints the board to the console each step

2. **Board.java**  
   - Stores a 2D `boolean` array (`true` = alive, `false` = dead)  
   - Randomly initialises the board  
   - Prints it to the console using black/white squares (⬛ / ⬜)

3. **GameOfLife.java**  
   - Counts alive neighbours for each cell  
   - Applies the four Game of Life rules  
   - Generates a new board each iteration

---

## 🖥️ How to Run

### 1. Compile
```bash
javac Main.java Board.java GameOfLife.java
java Main
```
- The program will display generations in the console using black and white squares.
- Each generation updates automatically every 150 ms (adjustable in Main.java).

## ⚙️ Configuration

You can change these constants at the top of Main.java:
```
private static final int ROWS = 20;        // Board height
private static final int COLS = 40;        // Board width
private static final double DENSITY = 0.30; // % of cells alive initially
private static final int GENERATIONS = 200; // Total generations
private static final int DELAY_MS = 150;    // Delay between generations
```

## 🧠 Example Output (Console)

```
Conway's Game of Life  |  Generation: 5
⬜⬜⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬛⬛⬜⬜⬛⬜⬜⬛⬛⬜⬜⬜⬛⬜⬜⬛⬜⬜⬜⬜
⬜⬜⬛⬛⬜⬛⬛⬜⬜⬛⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜
...
```
Press Ctrl + C to stop the program.

## 🧩 Learning Objectives

- Understand cellular automata
- Practice with 2D arrays and loops
- Apply conditional logic and method structure in Java
- Work with console I/O and simple visualization

## 📄 References

1. [Conway’s Game of Life – Wikipedia](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)
2. [playgameoflife.com](https://playgameoflife.com/)
3. [W3Schools – Java Arrays ](https://www.w3schools.com/java/java_arrays.asp)

## 💬 Author
- **Ada Dilara Ozgurel - 284612**
- **Politechnika Wroclawska, 1st-Year Applied Computer Science Student**
