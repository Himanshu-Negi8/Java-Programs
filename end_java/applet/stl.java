import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class stl extends Applet
{

public void init()
{
addMouseListener(new B());
addMouseListener(new B());

addMouseListener(new B());
}
class B extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
setBackground(Color.red);
}
public void mouseEntered(MouseEvent e)
{
setBackground(Color.green);
}
public void mouseExited(MouseEvent e)
{
setBackground(Color.blue);
}
}

}

/*
<applet code="stl" height=222 width=222>
</applet>
*/


