import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class fifthap extends Applet  {
	
		TextField t1;

		public void init()
		{
			t1 = new TextField(50);
			t1.addKeyListener(new B());
			add(t1);
		}
	
	class B extends KeyAdapter{

		public void keyTyped(KeyEvent e){

			char ch = e.getKeyChar();
			if(!Character.isLetter(ch)){
				t1.setEditable(false);
			}else{
				t1.setEditable(true);
			}
		}
	}
}

/*
<applet code="fifthap" height=222 width=222>
<param name="x" value=20>
<param name="y" value=240>
<param name="z" value=240>
</applet>
*/