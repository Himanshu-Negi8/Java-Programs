import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class B extends Applet
{


public void paint(Graphics g)
{
String s=getParameter("p");
g.drawString(s,22,22);
}


}

/*<applet code="B" height=222 width=222>
<param name="p" value="himanshu">
</applet>*/