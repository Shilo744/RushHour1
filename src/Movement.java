import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseMotionListener {
    static int x,y;
    Car car;
    public Movement(Car car){
        System.out.println("Movement");
        x=car.getCar().getX();
        y=car.getCar().getY();
        this.car=car;
    }
    public void mouseDragged(MouseEvent e) {
        System.out.println("drag");
car.getCar().setX(e.getX());
        car.getCar().setY(e.getY());
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("move");
    }
}