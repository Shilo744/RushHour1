import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameScene extends JPanel implements ActionListener,MouseListener {

    public static final int SLEEP_TIME = 5;
    public final int CAR_X_WIDTH =240;
    public final int CAR_X_HEIGHT=120;
    public final int CAR_Y_WIDTH =120;
    public final int CAR_Y_HEIGHT=240;
    public final int FULL_LINE=120;

    public final int LONG_CAR_X_WIDTH =360;
    public final int LONG_CAR_Y_HEIGHT=360;

    private Board board;
    private CarX xCar;
    private CarX aCar;
    private CarX cCar;
    private CarY bCar;

    private CarY longCarP;
    private CarY longCarQ;
    private CarY longCarO;
    private CarX longCarR;


    public GameScene(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
            this.setBackground(Color.white);
        this.setLayout(null);
        this.setDoubleBuffered(true);
        board = new Board();
        final int CORRECTION=board.LINE_THICKNESS/2;
        this.xCar = new CarX(board.BOARD_START_X+CORRECTION+FULL_LINE,board.BOARD_START_Y+2*FULL_LINE+CORRECTION, CAR_X_WIDTH,CAR_X_HEIGHT,Color.red);
        this.aCar = new CarX(board.BOARD_START_X+CORRECTION,board.BOARD_START_Y+CORRECTION, CAR_X_WIDTH,CAR_X_HEIGHT,Color.green);
        this.bCar = new CarY(board.BOARD_START_X+CORRECTION,board.BOARD_START_Y+4*FULL_LINE+CORRECTION, CAR_Y_WIDTH,CAR_Y_HEIGHT,Color.orange);
        this.cCar = new CarX(board.BOARD_START_X+CORRECTION+4*FULL_LINE,board.BOARD_START_Y+4*FULL_LINE+CORRECTION, CAR_X_WIDTH,CAR_X_HEIGHT,Color.CYAN);

        this.longCarP = new CarY(board.BOARD_START_X+CORRECTION,board.BOARD_START_Y+FULL_LINE+CORRECTION, CAR_Y_WIDTH,LONG_CAR_Y_HEIGHT,Color.magenta);
        this.longCarQ = new CarY(board.BOARD_START_X+CORRECTION+3*FULL_LINE,board.BOARD_START_Y+FULL_LINE+CORRECTION, CAR_Y_WIDTH,LONG_CAR_Y_HEIGHT,Color.BLUE);
        this.longCarO = new CarY(board.BOARD_START_X+CORRECTION+5*FULL_LINE,board.BOARD_START_Y+CORRECTION, CAR_Y_WIDTH,LONG_CAR_Y_HEIGHT,Color.YELLOW);
        this.longCarR = new CarX(board.BOARD_START_X+CORRECTION+2*FULL_LINE,board.BOARD_START_Y+5*FULL_LINE+CORRECTION, LONG_CAR_X_WIDTH,CAR_X_HEIGHT,Color.green);


        this.mainGameLoop();
//        Movement movement = new Movement(brick1);
//        MouseClickEvent mouseClickEvent = new MouseClickEvent();
//        this.addKeyListener(movement);
        this.setFocusable(true);
        this.requestFocus();

    }
    private void mainGameLoop(){
        Thread thread1 = new Thread(() -> {
            while (true){
                try {
                    repaint();
                    Thread.sleep(SLEEP_TIME);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
   protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
       this.board.paint(graphics);
        this.xCar.paint(graphics);
        this.bCar.paint(graphics);
        this.aCar.paint(graphics);
        this.cCar.paint(graphics);

       this.longCarP.paint(graphics);
       this.longCarQ.paint(graphics);
       this.longCarO.paint(graphics);
       this.longCarR.paint(graphics);

   }
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
    public void actionPerformed(ActionEvent e) {

    }
}

