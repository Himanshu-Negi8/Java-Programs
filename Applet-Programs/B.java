import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


public class B extends Applet
{
  String s =" ";
public void init()
{
	 s = getParameter("s");
	
	 	int r = Integer.parseInt(s);

		System.out.println(r);	
	 
}

}


/*<applet code="B" height=222 width=222>
<param name="s" value=50>
</applet>*/