import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class thin extends Applet
{

public void init()
{
addMouseListener(new B());
addMouseListener(new MouseAdapter(){
public void mouseEntered(MouseEvent e)
{
setBackground(Color.green);
}
});

addMouseListener(new MouseAdapter(){
public void mouseExited(MouseEvent e)
{
setBackground(Color.blue);
}
});
}
class B extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
setBackground(Color.red);
}
}

}

/*
<applet code="thin" height=222 width=222>
</applet>
*/


