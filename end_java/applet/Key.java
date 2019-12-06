import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Key extends Applet
{
TextField t1,t2;
public void init()
{
t1=new TextField(30);
t2=new TextField(30);
t1.addKeyListener(new B());
add(t1);
add(t2);
}
class B extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{
char c = e.getKeyChar();
t2.setText(Character.toString(c));
}
}
}


/*
<applet code="Key" height=222 width=222>
</applet>
*/