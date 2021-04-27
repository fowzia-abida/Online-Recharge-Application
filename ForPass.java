import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ForPass extends JFrame
{
    JTextField emailTf, passTf;
	JLabel emailLb, passLb, noteLb;
    JButton b1,b2;
    ForPass()	{
        this.setLayout(null);
        emailLb = new JLabel("Email:",JLabel.CENTER);passLb = new JLabel("Password:",JLabel.CENTER);
        emailTf = new JTextField(20);passTf = new JTextField(20);
        
		noteLb = new JLabel("",JLabel.CENTER);
        
		b1=new JButton("Get Password");
        b2=new JButton("Sign Up");
        ForPassButton bk=new ForPassButton();bk.setForPass(this);
		b1.addActionListener(bk);
		b2.addActionListener(bk);
		
		
		this.add(emailLb);
        this.add(passLb);
		
		this.add(noteLb);
		
		this.add(emailTf);
        this.add(passTf);
        
        this.add(b1);
        this.add(b2);
		
        emailLb.setBounds(70,90,90,60);
        emailTf.setBounds(200,110,90,20);
		
		//passLb.setBounds(70,130,90,60);
        //passTf.setBounds(200,150,90,20);
        
		noteLb.setBounds(100, 150, 200, 200);
		
		b1.setBounds(80,260,180,60);
        //b2.setBounds(200,260,100,40);
		
		setVisible(true);
        setSize(400,400);
		setTitle("Recover password");
		
		
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
		ForPass ff = new ForPass();
        
    }
	
}

class ForPassButton implements ActionListener
{
	
	ForPass forPass;
	
	
	void setForPass(ForPass s)	{
		forPass = s;
	}
	
	public void actionPerformed(ActionEvent a){
		//System.out.println(a.getActionCommand());
		
		
		DBSignIn dd = new DBSignIn();
			
		String shy1 = forPass.emailTf.getText();
		//String shy2 = signInFrame.passTf.getText();
		
		if(shy1.equals(""))	{
			//System.out.println("empty bruh");
			forPass.changeNoteLb("Enter Valid Email Address");
			return;
		}
		if(!dd.checkEmail(shy1))	{
			//System.out.println("email address not found bruh");
			forPass.changeNoteLb("email address not found bruh");
			return;
		}
		/*
		if(!dd.checkPass(shy1, shy2))	{
			//System.out.println("wrong password bruh");
			signInFrame.changeNoteLb("wrong password bruh");
			return;
		}
		*/
		//AmountFrame b = new AmountFrame();b.setSignInFrame(signInFrame);
		String pass = dd.getEmail(shy1);
		forPass.setVisible(false);
		forPass.dispose();
		PrintPass ff = new PrintPass(pass);
		System.out.println("pass : " + pass);
		//System.out.println("Button Pressed");
	}
}

class PrintPass extends JFrame
{
    JTextField emailTf, passTf;
	JLabel emailLb, passLb, noteLb;
    JButton b1,b2;
    PrintPass(String shimi)	{
        this.setLayout(null);
        //emailLb = new JLabel("Email:",JLabel.CENTER);passLb = new JLabel("Password:",JLabel.CENTER);
        //emailTf = new JTextField(20);passTf = new JTextField(20);
        
		noteLb = new JLabel("",JLabel.CENTER);
        
		/*
		b1=new JButton("Get Pass");
        b2=new JButton("Sign Up");
        ForPassButton bk=new ForPassButton();//bk.setForPass(this);
		b1.addActionListener(bk);
		b2.addActionListener(bk);
		this.add(emailLb);
        this.add(passLb);
		
		
		
		this.add(emailTf);
        this.add(passTf);
        
        this.add(b1);
        this.add(b2);
		*/
		
		
		
		this.add(noteLb);
        //emailLb.setBounds(70,90,90,60);
        //emailTf.setBounds(200,110,90,20);
		
		//passLb.setBounds(70,130,90,60);
        //passTf.setBounds(200,150,90,20);
        
		noteLb.setBounds(140, 150, 100, 100);
		
		noteLb.setText("password : " + shimi);
		//b1.setBounds(150,260,100,40);
        //b2.setBounds(200,260,100,40);
		
		setVisible(true);
        setSize(400,400);
		//setTitle("my login window");
		
		
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
		PrintPass ff = new PrintPass("");
        
    }
	
}