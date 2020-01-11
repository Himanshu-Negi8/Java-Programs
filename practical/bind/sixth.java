import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class sixthap extends Applet  {
	
		TextField t1,t2;

		public void init()
		{
			t1 = new TextField(50);
			t1 = new TextField(50);
			t1.addKeyListener(new B());
			add(t1);
		}
	
	class B extends KeyAdapter{

		public void keyTyped(KeyEvent e){

			char ch = e.getKeyChar();
			t2.setText(Character.toString(ch));
		}
	}
}

/*
<applet code="sixthap" height=222 width=222>
<param name="x" value=20>
<param name="y" value=240>
<param name="z" value=240>
</applet>
*/