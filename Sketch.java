import processing.core.PApplet;

public class Sketch extends PApplet {
    int rows = 30;
    int cols = 30;
    int precentA = 25;
    Grid grid;
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(220);
    grid = new Grid(rows, cols, precentA);
    frameRate(1);
  }

    public void draw() {
        background(220);
        int cellSize = width / cols;
        Cell[][] world = grid.getWorld();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (world[r][c].isAlive()) {
                    fill(0, 200, 50);
                } else {
                    fill(50, 50, 50);
                }
                rect(c * cellSize, r * cellSize, cellSize, cellSize);
            }
        }

        grid.nextGeneration();
    }

}
