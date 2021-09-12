import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

public class MouseClick extends Applet implements MouseListener
{
    int a,b;
    public void init()
    {
        addMouseListener(this);
    }
    public void paint(Graphics gp)
    { int [] x = {170, 280, 300,150};
        int [] y = {100, 100, 150, 150};
        gp.setColor(Color.cyan);
        gp.fillRect(150, 150, 150, 200); //House
        gp.drawRect(200, 200, 50, 150); // Door
        gp.setColor(Color.pink);
        gp.fillRect(200,200,50,150);
        gp.setColor(Color.gray);
        gp.fillPolygon(x,y,4);
        if(a>200 && a<300 && b>200 && b<300)
        {
            gp.setColor(Color.orange);
            gp.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }


    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e)
    {
        a=e.getX();
        b=e.getY();
        repaint();

    }
    public void mouseReleased(MouseEvent e)
    {

    }

}