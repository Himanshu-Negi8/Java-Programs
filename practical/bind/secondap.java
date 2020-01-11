import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class secondap extends Applet
{
	public void paint(Graphics g)
	{
		String s = getParameter("p");
		g.drawString(s,23,203);
	}
}

/*

<applet code="secondap" height =222 width=222>
<param name="p" value ="himanshu negi">
</applet>
*/