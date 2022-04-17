import javax.swing.*;
import java.awt.*;

public class GameScene extends JPanel {
    private Board board=new Board();
    private Level1 level1=new Level1();
Movement movement;
    public GameScene(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.addMouseMotionListener(movement);

    }
   protected void paintComponent(Graphics graphics){
       super.paintComponent(graphics);
       this.board.paint(graphics);
       level1.paint(graphics);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Level1 getLevel1() {
        return level1;
    }

    public void setLevel1(Level1 level1) {
        this.level1 = level1;
    }
}

