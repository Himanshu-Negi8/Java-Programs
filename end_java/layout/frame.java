import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class frame 
{

public static void main(String a[])
{
int i=2;
while(i<5)
{
C obj = new C("himanshu");
i++;
}

}
}

class C extends Frame
{
C(String s)
{
super(s);
setVisible(true);
setSize(222,222);

}
}




