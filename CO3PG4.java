import java.applet.*;
import java.awt.*;
public class CO3PG4 extends Applet {
    public void paint(Graphics g){
			g.setColor(Color.blue);
            g.fillOval(0, 0, 170, 175);
			
			g.setColor(Color.red);
			g.fillRect(100, 190, 170, 175);
			
			int xPoints[] = {250,320,170,250};
			int yPoints[] = {100,150,150,100};
			int aPoints[] = {550,530,640,650,710,840};
			int bPoints[] = {140,110,50,40,30,10};  
			g.setColor(Color.black);
			g.fillPolygon(xPoints, yPoints, 4);

			g.setColor(Color.green);
			g.fillPolygon(aPoints, bPoints, 6);
			
			
    }
}
