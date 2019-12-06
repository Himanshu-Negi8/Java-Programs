import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class setty extends Applet
{

TextField t1;
public void init()
{
t1 = new TextField();
t1.addKeyListener(new C());
add(t1);

}

}
class C extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{
char c = e.getKeyChar();
if(!Character.isLetter(c))
{
t1.setEditable(false);
}
else
{
t1.setEditable(true);
}
}
}


/*
<applet code="setty" height=222 width=222>
</applet>
*/
