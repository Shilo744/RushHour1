import java.awt.*;
public class Board {

   public final static int LINE_THICKNESS=12;
   public final static int BOARD_START_X=75;
   public final static int BOARD_START_Y=30;
   public final int BOARD_WIDTH_HEIGHT=720;
   public final int LINE_DISTANCE=120;

   private final Rectangle board =new Rectangle(BOARD_START_X,BOARD_START_Y,BOARD_WIDTH_HEIGHT,BOARD_WIDTH_HEIGHT, Color.LIGHT_GRAY);

   private final Rectangle line1=new Rectangle(BOARD_START_X,BOARD_START_Y,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line2=new Rectangle(BOARD_START_X,BOARD_START_Y+LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line3=new Rectangle(BOARD_START_X,BOARD_START_Y+2*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line4=new Rectangle(BOARD_START_X,BOARD_START_Y+3*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line5=new Rectangle(BOARD_START_X,BOARD_START_Y+4*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line6=new Rectangle(BOARD_START_X,BOARD_START_Y+5*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
   private final Rectangle line7=new Rectangle(BOARD_START_X,BOARD_START_Y+6*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);

    private final Rectangle line8=new Rectangle(BOARD_START_X+LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final Rectangle line9=new Rectangle(BOARD_START_X+2*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final Rectangle line10=new Rectangle(BOARD_START_X+3*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final Rectangle line11=new Rectangle(BOARD_START_X+4*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final Rectangle line12=new Rectangle(BOARD_START_X+5*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final Rectangle line13=new Rectangle(BOARD_START_X,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);

    private final Rectangle line14=new Rectangle(BOARD_START_X+6*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,2*LINE_DISTANCE+LINE_THICKNESS,Color.gray);
    private final Rectangle line15=new Rectangle(BOARD_START_X+6*LINE_DISTANCE,BOARD_START_Y+3*LINE_DISTANCE,LINE_THICKNESS,3*LINE_DISTANCE+LINE_THICKNESS,Color.gray);

    public void paint(Graphics graphics) {
        this.board.paint(graphics);

        this.line1.paint(graphics);
        this.line2.paint(graphics);
        this.line3.paint(graphics);
        this.line4.paint(graphics);
        this.line5.paint(graphics);
        this.line6.paint(graphics);
        this.line7.paint(graphics);

        this.line8.paint(graphics);
        this.line9.paint(graphics);
        this.line10.paint(graphics);
        this.line11.paint(graphics);
        this.line12.paint(graphics);
        this.line13.paint(graphics);
        this.line14.paint(graphics);
        this.line15.paint(graphics);

    }
}

