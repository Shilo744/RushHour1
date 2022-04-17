import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

 class AL extends MouseAdapter {
    public static int x,y;
    Car car;
    AL(Car car){
        this.x=car.getX();
        this.y=car.getY();
        this.car=car;
    }
    public void mouseDragged(MouseEvent e) {

        x=e.getX()-25;
        y=e.getY()-25;

        e.consume();
    }

}