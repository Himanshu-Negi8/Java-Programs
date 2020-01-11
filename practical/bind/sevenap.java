import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class sevenap extends Applet  {
	
		int x,y;
		int x1,y1,x2,y2,i=0;
		public void init(){
			addMouseListener(new B());
		}
		public void paint(Graphics g){
			g.drawLine(x1,y1,x2,y2);
		}

		class B extends MouseAdapter{

			public void mouseClicked(MouseEvent e){
				if(i==0){
					x1= e.getX();
					y1=e.getY();
					i++;
				}else{
					x2=e.getX();
					y2=e.getY();
					i--;
					repaint();
				}
			}
		}
}

/*
<applet code="sevenap" height=222 width=222>

</applet>
*/