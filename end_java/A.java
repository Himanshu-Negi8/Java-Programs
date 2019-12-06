import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class A extends Applet
{
String s ="hello";
int i=0;
public void start()
{
System.out.println(i++);
}
public void stop()
{
System.out.println(i--);
}


}

/*
<applet code="A" height=222 width=222>
</applet>
*/