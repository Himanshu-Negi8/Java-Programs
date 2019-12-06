import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class mouseClicked extends Applet
{
int x,y;
int x1,y1,x2,y2,i=0;
public void init()
{
addMouseListener(new B());
}
public void paint(Graphics g)
{
g.drawLine(x1,y1,x2,y2);
}
class B extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
if(i==0)
{
x= e.getX();
y=e.getY();;
x1=x;y1=y;
i++;
}
else
{
x= e.getX();
y=e.getY();;
x2=x;y2=y;
i--;
repaint();
}
}

}
}

/*
<applet code="mouseClicked" height=222 width=222>
</applet>
*/


