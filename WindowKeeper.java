import java.awt.*;
import java.awt.event.*;

class WindowKeeper extends WindowAdapter{
	public void windowClosing(WindowEvent a){
		System.out.println("Window is closing");
		System.exit(0);
	}
}
