import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Rectangle extends JPanel {
        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

    public void paint(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(this.x, this.y, this.width,this.height);
    }

        public Rectangle(int x, int y, int width, int height, Color color){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }
    public Rectangle(){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void mouseDragged(MouseEvent e) {

    }
    public void mouseMoved(MouseEvent e) {

    }

    public class Movement implements MouseMotionListener {

        public void mouseDragged(MouseEvent e) {
            System.out.println("hello");
            x=e.getX();
            y=e.getY();
            repaint();
        }
        public void mouseMoved(MouseEvent e) {

        }
    }
}
