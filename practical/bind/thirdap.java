import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class thirdap extends Applet implements ActionListener
{
	Button b1,b2;

	public void init()
	{
		b1 = new Button("Click me for green");
		b2 = new Button("Click me for red");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			setBackground(Color.green);
		}else{
			setBackground(Color.red);
		}
	}
}

/*

<applet code="thirdap" height=222 width=222>
</applet>
*/