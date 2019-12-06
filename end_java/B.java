import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/*public class B extends Applet
{Button b,b1;
public void init()
{
int i=0;
 b= new Button("add");
 b1 = new Button("grren");
b.addActionListener(new C());
b1.addActionListener(new C());
add(b);
add(b1);
}
class C implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
setBackground(Color.red);
else
setBackground(Color.green);
}
}



}*/

/*<applet code="B" height=222 width=222>
</applet>*/



/*public class B extends Applet
{
TextField t1,t2;
Button b;
public void init()
{
t1=new TextField();
add(t1);
t2=new TextField();
add(t2);
b = new Button("Click me");
add(b);
}

}*/



public class B extends Applet
{
public void paint(Graphics g)
{
g.drawString("himanshu",22,22);
g.drawLine(30,30,70,70);
}

}