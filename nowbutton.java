import java.awt.*;
import java.awt.event.*;

class nowbutton implements ActionListener
{
	
	now now;
	void setLastFrame(now a)	{
		now = a;
	}
	
	public void actionPerformed(ActionEvent a){
		//System.out.println(a.getActionCommand());
		String str = a.getActionCommand();
		if(str.equals("Finish"))
		{			
		now.setVisible(false);
		now.dispose();
		}
		else
		{
			
		}
		//System.out.println("Button Pressed");
	}
}