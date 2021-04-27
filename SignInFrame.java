import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SignInFrame extends JFrame
{
    JTextField emailTf;
    JPasswordField	passPf;
	JLabel emailLb, passLb, noteLb;
    JButton b1,b2, b3;
    SignInFrame()	{
        this.setLayout(null);
        emailLb = new JLabel("Email:",JLabel.CENTER);
		passLb = new JLabel("Password:",JLabel.CENTER);
        emailTf = new JTextField(20);
		passPf = new JPasswordField(20);
        
		noteLb = new JLabel("",JLabel.CENTER);
        
		b1=new JButton("Sign In");
        b2=new JButton("Sign Up");
		b3=new JButton("Forgot Password");
        SignInFrameButton bk=new SignInFrameButton();bk.setSignInFrame(this);
		b1.addActionListener(bk);
		b2.addActionListener(bk);
		b3.addActionListener(bk);
		
		
		this.add(emailLb);
        this.add(passLb);
		
		this.add(noteLb);
		
		this.add(emailTf);
        this.add(passPf);
        
        this.add(b1);
        this.add(b2);
		this.add(b3);
		
        emailLb.setBounds(70,90,90,60);
        emailTf.setBounds(200,110,90,20);
		
		passLb.setBounds(70,130,90,60);
        passPf.setBounds(200,150,90,20);
        
		noteLb.setBounds(100, 150, 200, 200);
		
		b1.setBounds(90,260,100,40);
        b2.setBounds(200,260,100,40);
		b3.setBounds(130,310,150,20);
		
		setVisible(true);
        setSize(400,400);
		setTitle("SignIn");
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/*
		WindowKeeper wk=new WindowKeeper();
	    addWindowListener(wk);
		*/
    }
	void changeNoteLb(String ss)	{
		noteLb.setText(ss);
	}
    public static void main(String args[])
    {
		SignInFrame b = new SignInFrame();
        
    }
	
}