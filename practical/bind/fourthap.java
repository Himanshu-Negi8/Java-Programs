import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class fourthap extends Applet implements ActionListener
{
	Button b1;
	int r,g,b;

	public void init(){
		 r = Integer.parseInt(getParameter("x"));
		 g = Integer.parseInt(getParameter("y"));
		 b = Integer.parseInt(getParameter("z"));
		b1 = new Button("Click me");
		b1.addActionListener(this);
		add(b1);
	}

	public void actionPerformed(ActionEvent e){
		Color mycolor = new Color(r,g,b);
		setBackground(mycolor);
	}
}

/*
<applet code="fourthap" height=222 width=222>
<param name="x" value=20>
<param name="y" value=240>
<param name="z" value=240>
</applet>
*/