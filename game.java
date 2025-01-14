package game;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to MazeEscape!");
        // Initialize game components
        MazeGenerator maze = new MazeGenerator(10, 10);
        maze.generateMaze();
        maze.printMaze();
    }
}
