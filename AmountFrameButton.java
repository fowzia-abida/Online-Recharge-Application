import java.awt.*;
import java.awt.event.*;

class AmountFrameButton implements ActionListener
{
	
	AmountFrame amountFrame;
	void setAmountFrame(AmountFrame s)	{
		amountFrame = s;
	}
	
	public void actionPerformed(ActionEvent a){
		//System.out.println(a.getActionCommand());
		/*
		String str = a.getActionCommand();
		if(str.equals("Back"))	{
			if(amountFrame.konta == 0)	{
				amountFrame.signInFrame
			}
			
			return;
		}
		*/
		String shy1 = amountFrame.numTf.getText();
		String shy2 = amountFrame.amountTf.getText();
		if(shy1.equals("") || shy2.equals(""))	{
			//System.out.println("Fill The Requirement");
			amountFrame.changeNoteLb("Fill The Requirement");
			return;
		}
		if (shy1.matches("[0-9]+") && shy2.matches("[0-9]+")) {
			
		}
		else	{
			amountFrame.changeNoteLb("Non-Negative Integer Only");
			return;
		}
		/*
		if(Integer.parseInt(shy2) < 0)	{
			amountFrame.changeNoteLb("Positive Only");
			return;
		}
		*/
		//amountFrame.mobno = shy1;amountFrame.amount = shy2;
		CardInfoFrame cif = new CardInfoFrame(shy1, shy2);cif.setAmountFrame(amountFrame);
		System.out.println("amount : " + shy2);
		amountFrame.setVisible(false);
		//amountFrame.dispose();
		//System.out.println("Button Pressed");
	}
}