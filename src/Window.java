import javax.swing.*;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 900;

    public static void main(String[] args) {
        Window window = new Window();
    }

    public Window() {
        this.setTitle("RUSH HOUR");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        GameScene gameScene = new GameScene(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);
    }
}
