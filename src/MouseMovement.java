import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMovement implements  MouseMotionListener {

    boolean mouseDragged;
    int mx,my;

    public void mouseDragged(MouseEvent e) {
        mx=e.getX();
        my=e.getY();

        mouseDragged=true;

    e.consume();
    }

    public void mouseMoved(MouseEvent e) {
        mx=e.getX();
        my=e.getY();

        mouseDragged=false;

    e.consume();
    }
}
