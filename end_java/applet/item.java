import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class item extends Applet implements ItemListener
{
CheckboxGroup cfg;
Checkbox c1,c2,c3;

public void init()
{
cfg = new CheckboxGroup();
c1= new Checkbox("xp",true,cfg);
c2= new Checkbox("linux",true,cfg);
c3= new Checkbox("maci",true,cfg);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
add(c1);add(c2);add(c3);
}
public void itemStateChanged(ItemEvent e)
{
System.out.println(e.getItem());
}

}
/*
<applet code="item" height=222 width=222>
</applet>
*/