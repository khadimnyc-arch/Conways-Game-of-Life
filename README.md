# Conway's Game of Life

An object-oriented Processing visualizer written in Java that implements John Conway's classic cellular automaton.

## Features

* **Object-Oriented Architecture:** Uses modular data structures (`Grid.java` and `Cell.java`) to manage individual cell states and grid updates.
* **Randomized Initialization:** Generates an initial board state with a configurable percentage of live cells.
* **Generational Physics:** Evaluates neighbor rules dynamically to compute and render the next generation frame-by-frame.

## How to Run

1. Clone or download this repository.
2. Open the project in your Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure the **Processing core library** (`core.jar`) is added to your project dependencies/classpath.
4. Run `Main.java`.

## Requirements

* Java JDK 8 or higher
* Processing 3/4 `core.jar` library
