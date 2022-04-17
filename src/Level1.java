import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Level1 extends JPanel{

    private Car xCar;
    private Car aCar;
    private Car bCar;
    private Car cCar;

    private Car oTruck;
    private Car pTruck;
    private Car qTruck;
    private Car rTruck;
    private Car cars[]=new Car[8];

    Level1(){
    xCar = new Car("xCar",3,2,Color.red);
    aCar = new Car("xCar",1,1,Color.green);
    bCar = new Car("yCar",5,1,Color.orange);
    cCar = new Car("xCar",5,5,Color.cyan);

    oTruck = new Car("yTruck",1,6,Color.yellow);
    pTruck = new Car("yTruck",2,1,Color.magenta);
    qTruck = new Car("yTruck",2,4,Color.blue);
    rTruck = new Car("xTruck",6,3,Color.green);

        cars[0]=xCar;
        cars[1]=aCar;
        cars[2]=bCar;
        cars[3]=cCar;

        cars[4]=oTruck;
        cars[5]=pTruck;
        cars[6]=qTruck;
        cars[7]=rTruck;

    }

    public Car []getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void paint(Graphics graphics) {
        xCar.paint(graphics);
        aCar.paint(graphics);
        bCar.paint(graphics);
        cCar.paint(graphics);

        oTruck.paint(graphics);
        pTruck.paint(graphics);
        qTruck.paint(graphics);
        rTruck.paint(graphics);
    }

}
