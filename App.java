import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);

        frame.add(snakeGame);
        frame.pack();  // Pack the frame after adding the game panel
        frame.setVisible(true);  // Set visibility after packing
        frame.setLocationRelativeTo(null);  // Center the frame on the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        snakeGame.requestFocus();  // Make sure the game panel has focus for key inputs
    }
}