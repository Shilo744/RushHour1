import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Objects;

public class Car extends JPanel{
    final int CORRECTION=Board.LINE_THICKNESS/2;
    public final int CAR_X_WIDTH =240;
    public final int CAR_X_HEIGHT=120;
    public final int CAR_Y_WIDTH =120;
    public final int CAR_Y_HEIGHT=240;
    public final int FULL_LINE=120;

    public final int LONG_CAR_X_WIDTH =360;
    public final int LONG_CAR_Y_HEIGHT=360;
    public final int MAKE_START_FROM_ONE=-1;
    private Rectangle car =new Rectangle();

    public Rectangle getCar() {
        return car;
    }

    public Car(String carType_xCar_yCar_xTruck_yTruck, int line,int column,  Color color) {
        this.setLayout(null);
        this.setDoubleBuffered(true);
        Click click=new Click();
        DragListener dragListener=new DragListener();
        this.addMouseListener(click);
        this.addMouseMotionListener(dragListener);


        car.setX(FULL_LINE*(column+MAKE_START_FROM_ONE)+Board.BOARD_START_X+CORRECTION);
        car.setY(FULL_LINE*(line+MAKE_START_FROM_ONE)+Board.BOARD_START_Y+CORRECTION);
        car.setColor(color);

        if(Objects.equals(carType_xCar_yCar_xTruck_yTruck, "xCar")){
            car.setWidth(CAR_X_WIDTH);
            car.setHeight(CAR_X_HEIGHT);
        }
        else if(Objects.equals(carType_xCar_yCar_xTruck_yTruck, "yCar")){
            car.setWidth(CAR_Y_WIDTH);
            car.setHeight(CAR_Y_HEIGHT);
        }
        else if(Objects.equals(carType_xCar_yCar_xTruck_yTruck, "xTruck")){
            car.setWidth(LONG_CAR_X_WIDTH);
            car.setHeight(CAR_X_HEIGHT);
        }
        else if(Objects.equals(carType_xCar_yCar_xTruck_yTruck, "yTruck")){
            car.setWidth(CAR_Y_WIDTH);
            car.setHeight(LONG_CAR_Y_HEIGHT);
        }

    }

    public void paint(Graphics graphics) {
        this.car.paint(graphics);
    }
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.car.paint(graphics);
    }
    private class Click extends MouseAdapter {
public void mousePressed(MouseEvent e){
    car.setX(e.getX());
    car.setY(e.getY());
}
    }
    private class DragListener extends MouseMotionAdapter {
public  void mouseDragged(MouseEvent e){
    car.setX(e.getX());
    car.setY(e.getY());
}
    }
}
