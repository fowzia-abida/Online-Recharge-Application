import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SignInFrameButton implements ActionListener
{
	
	SignInFrame signInFrame;
	
	
	void setSignInFrame(SignInFrame s)	{
		signInFrame = s;
	}
	
	public void actionPerformed(ActionEvent a){
		//System.out.println(a.getActionCommand());
		String str = a.getActionCommand();
		if(str.equals("Sign Up"))	{
			SignUpFrame b = new SignUpFrame();
		}
		else if(str.equals("Sign In"))	{//sign in
			DBSignIn dd = new DBSignIn();
			
			String shy1 = signInFrame.emailTf.getText();
			String shy2 = signInFrame.passPf.getText();
			
			if(shy1.equals("") || shy2.equals(""))	{
				//System.out.println("Fill The Requirement");
				signInFrame.changeNoteLb("Fill The Requirement");
				return;
			}
			if(!dd.checkEmail(shy1))	{
				//System.out.println("Email address not found ");
				signInFrame.changeNoteLb("Email address not found");
				return;
			}
			
			if(!dd.checkPass(shy1, shy2))	{
				//System.out.println("wrong password ");
				signInFrame.changeNoteLb("wrong password ");
				return;
			}
			AmountFrame b = new AmountFrame();b.setSignInFrame(signInFrame);
		}
		else	{
			ForPass ff = new ForPass();
			return;
		}
		signInFrame.setVisible(false);
		signInFrame.dispose();
		//System.out.println("Button Pressed");
	}
}