import java.awt.*;
import java.awt.event.*;

class SignUpFrameButton implements ActionListener
{
	
	SignUpFrame signUpFrame;
	void setSignUpFrame(SignUpFrame s)	{
		signUpFrame = s;
	}
	
	public void actionPerformed(ActionEvent a){
		
		String str = a.getActionCommand();
		if(str.equals("Back"))
		{
			SignInFrame b = new SignInFrame();
			b.setVisible(true);
			signUpFrame.setVisible(false);
		}
		
		else if(str.equals("Submit")){
			DBSignUp dd = new DBSignUp();
		
		String shy1 = signUpFrame.nameTf.getText();
		String shy2 = signUpFrame.emailTf.getText();
		String shy3 = signUpFrame.passTf.getText();
		String shy4 = signUpFrame.cPassTf.getText();
		
		
		if(shy1.equals("") || shy2.equals("") || shy3.equals("") || shy4.equals(""))	{
			System.out.println("Fill The Requirement");
			signUpFrame.changeNoteLb("Fill The Requirement");
			return;
		}
		else if(dd.checkEmail(shy2))	{
			//System.out.println("email address already here bruh");
			signUpFrame.changeNoteLb("Email Address already Exist Here");
			return;
		}
		
		else if(!dd.checkPass(shy3, shy4))	{
			//System.out.println("passwords don't match bruh");
			signUpFrame.changeNoteLb("Passwords Don't Match");
			return;
		}
		else
		{
		//dd.addInfo("'" + shy1 + "'", "'" + shy2 + "'", "'" + shy3 + "'");
		dd.addInfo(shy1, shy2, shy3);
		AmountFrame b = new AmountFrame();
		b.setVisible(true);
		}
			
			
			
		//System.out.println(a.getActionCommand());
		
		signUpFrame.setVisible(false);
		//signUpFrame.dispose();
		//System.out.println("Button Pressed");
		}
		else
		{
			
		}
	}
}