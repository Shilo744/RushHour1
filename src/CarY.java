import java.awt.*;

public class CarY extends Rectangle{
    private boolean canMove = false;


    public CarY(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
        canMove = false;
    }
}
