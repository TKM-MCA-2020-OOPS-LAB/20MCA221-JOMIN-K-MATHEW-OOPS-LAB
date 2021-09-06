import java.applet.Applet;
import java.awt.*;

public class shapes extends Applet{
    public void paint(Graphics g){
        g.drawLine(50,30, 300, 30);
        g.setColor(Color.BLUE);
        g.fillRect(50, 80, 200, 40);
        g.setColor(Color.RED);
        g.fillOval(50,150,100,100);
        g.setColor(Color.CYAN);
        int x1[]={40, 130, 200, 50};
        int y1[]={310, 260, 310, 310};
        int n1=4;
        g.fillPolygon(x1, y1, n1);
    }
}