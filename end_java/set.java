import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class set extends Applet 
{
TextField t1,t2;
public void init()
{
t1 = new TextField(20);
t2 = new TextField(20);
t1.addTextListener(new C());
add(t1);
add(t2);
}

class C implements TextListener
{


public void textValueChanged(TextEvent e)
{
t2.setText(t1.getText());

}

}

}




/*
<applet code="set" height=222 width=222>
</applet>
*/