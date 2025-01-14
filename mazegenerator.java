package game;

import java.util.Random;

public class MazeGenerator {
    private final int rows, cols;
    private final char[][] maze;

    public MazeGenerator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        maze = new char[rows][cols];
    }

    public void generateMaze() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = random.nextBoolean() ? ' ' : '#';
            }
        }
        maze[0][0] = 'P'; // Player starts here
    }

    public void printMaze() {
        for (char[] row : maze) {
            System.out.println(new String(row));
        }
    }
}
