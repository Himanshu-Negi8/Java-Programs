import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class l1 extends Applet implements ActionListener
{
Button b;
public void init()
{
BorderLayout f = new BorderLayout();
setLayout(f);
b = new Button("ok");
b.addActionListener(this);
add(b);
}
public void actionPerformed(ActionEvent e)
{

}
}

/*
<applet code="l1" height=222 width=222>
</applet>
*/