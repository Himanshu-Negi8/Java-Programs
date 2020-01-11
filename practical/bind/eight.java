import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class eight extends Applet{

	int a=50,b=50,c=200,d=200;
	public void paint(Graphics g){
		g.drawRect(a,b,c,d);
		g.drawOval(a,b,c,d);

	}
}

/*
<applet code="eight" height=255 width=255>
</applet>
*/