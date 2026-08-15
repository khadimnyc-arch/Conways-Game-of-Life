public class Grid {
    private int generation;
    private Cell[][] world;

    public Grid(int rows, int cols, int percent) {
        this.world = new Cell[rows][cols];
        this.generation = 0;
        populate(rows, cols, percent);
    }

    private void populate(int rows, int cols, int percent) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                world[r][c] = new Cell(r, c, percent);
            }
        }
    }

    public Cell[][] getWorld() {
        return world;
    }

    public int countLivingNeighbors(int r, int c) {
        int count = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int nr = r + dr;
                int nc = c + dc;
                if (nr >= 0 && nr < world.length && nc >= 0 && nc < world[0].length) {
                    if (world[nr][nc].isAlive()) {
                        count++;
                    }
                }
            }
        }

        if (world[r][c].isAlive()) {
            count--;
        }

        return count;
    }

    public void nextGeneration() {
        Cell[][] next = new Cell[world.length][world[0].length];

        for (int r = 0; r < world.length; r++) {
            for (int c = 0; c < world[0].length; c++) {
                int neighbors = countLivingNeighbors(r, c);
                boolean currentlyAlive = world[r][c].isAlive();

                if (currentlyAlive && (neighbors == 2 || neighbors == 3)) {
                    next[r][c] = new Cell(r, c, 100);
                } else if (!currentlyAlive && neighbors == 3) {
                    next[r][c] = new Cell(r, c, 100);
                } else {
                    next[r][c] = new Cell(r, c, 0);
                }
            }
        }

        world = next;
        generation++;
    }

    public int getGeneration() {
        return generation;
    }
}
