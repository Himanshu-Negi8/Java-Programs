import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


public class C extends Applet
{
Button b;
int i=0;
public void init()
{
	b = new Button("add");
	b.addActionListener(new B());
	add(b);
}
class B implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(i%2==0)
		setBackground(Color.red);
	    else
	    	setBackground(Color.green);
	i++;

	}
}

}


/*<applet code="C" height=222 width=222>

</applet>*/