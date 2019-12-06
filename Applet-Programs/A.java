import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class A extends Applet
{
 TextField t;
public void init()
{
t = new TextField();
add(t);
t.addKeyListener(new B());

}


class B extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{
char c = e.getKeyChar();
if(!Character.isLetter(c))
{
t.setEditable(false);
}
else
{
t.setEditable(true);
}
}
}
}

/*<applet code="A" height=222 width=222>
</applet>*/