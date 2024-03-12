public class MazeSolver {
    public static void main(String[] args) {
        char[][] maze = {
                {'S', '.', '.', 'X', 'X'},
                {'X', 'X', '.', 'X', 'E'},
                {'.', '.', '.', '.', '.'},
                {'X', 'X', 'X', 'X', 'X'}
        };

        if (solveMaze(maze, 0, 0)) {
            System.out.println("Path found.");
            printMaze(maze); // Print the maze with the path if found
        } else {
            System.out.println("No path found.");
        }
    }

    public static boolean solveMaze(char[][] maze, int x, int y) {
        int numRows = maze.length;
        int numCols = maze[0].length;

        if (x < 0 || x >= numRows || y < 0 || y >= numCols || maze[x][y] == 'X' || maze[x][y] == 'V') {
            return false;
        }

        if (maze[x][y] == 'E') {
            return true;
        }

        if (maze[x][y] == 'S') {
            maze[x][y] = 'V'; // Mark the start as visited to avoid revisiting
        } else {
            maze[x][y] = 'V';
        }

        if (solveMaze(maze, x + 1, y) || solveMaze(maze, x - 1, y) ||
                solveMaze(maze, x, y + 1) || solveMaze(maze, x, y - 1)) {
            return true;
        }

        maze[x][y] = '.'; // Unmark the visited path if it leads to no solution
        return false;
    }

    private static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
