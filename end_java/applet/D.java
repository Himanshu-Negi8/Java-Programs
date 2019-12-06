import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class D extends Applet implements TextListener
{
TextField t1,t2;
public void init()
{
t1 = new TextField();
t2= new TextField();
t1.addTextListener (this);

add(t1);
add(t2);

}
public void textValueChanged(TextEvent e)
{
t2.setText(t1.getText()+":)");
}
}

/*
<applet code="D" height=222 width=222>
</applet>
*/