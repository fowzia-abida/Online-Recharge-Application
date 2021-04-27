import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SignUpFrame extends JFrame
{
    JLabel nameLb, emailLb, passLb, cPassLb;
	JTextField nameTf, emailTf, passTf, cPassTf;//
	JLabel noteLb;//
	
	JButton b1,b2;
	
    SignUpFrame()	{
        //setLayout(new FlowLayout());
        this.setLayout(null);
        nameLb = new JLabel("UserName:",JLabel.CENTER);passLb = new JLabel("Password:",JLabel.CENTER);
		emailLb = new JLabel("E-mail:",JLabel.CENTER);cPassLb = new JLabel("Confirm Password:",JLabel.CENTER);
        
		nameTf = new JTextField(50);passTf = new JTextField(50);
		emailTf = new JTextField(50);cPassTf = new JTextField(50);
        
		noteLb = new JLabel("",JLabel.CENTER);
		
		b1=new JButton("Submit");
		b2=new JButton("Back");
		//pass.setEchoChar('#');
        /*
		b1 = new Button("SIGN IN");
        b2 = new Button("SIGN UP");
        */
		
		this.add(nameLb);
        this.add(emailLb);
        this.add(passLb);
        this.add(cPassLb);
		
        this.add(nameTf);
        this.add(emailTf);
		this.add(passTf);
        this.add(cPassTf);
		
		this.add(noteLb);
		
		this.add(b1);
		this.add(b2);
		
		SignUpFrameButton bk=new SignUpFrameButton();bk.setSignUpFrame(this);
		b1.addActionListener(bk);
		b2.addActionListener(bk);
		
		int y = 90;
		
		int x1 = 200;int x2 = x1 + 130;
		
		int x1Width = 130;
		
        nameLb.setBounds(x1, y, x1Width, 60);
		nameTf.setBounds(x2, y + 20, 200, 20);
		
        emailLb.setBounds(x1, y + (40 * 1), x1Width, 60);
		emailTf.setBounds(x2, y + (40 * 1) + 20, 200, 20);
        
		passLb.setBounds(x1, y + (40 * 2), x1Width, 60);
		passTf.setBounds(x2, y + (40 * 2) + 20, 200, 20);
		
		cPassLb.setBounds(x1, y + (40 * 3), x1Width, 60);
		cPassTf.setBounds(x2, y + (40 * 3) + 20, 200, 20);
		
		
		b1.setBounds(x2 + 70,450,120,40);
		b2.setBounds(x2 + -50,450,120,40);
		
		noteLb.setBounds(x2 - 40,300,200,200);
		
		setVisible(true);
        setSize(800, 600);
		setTitle("SignUp Form");
		
		
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
		SignUpFrame b = new SignUpFrame();
        
        //ml.setVisible(true);
        //ml.setSize(400,400);
        //ml.setTitle("my login window");

    }
	
}