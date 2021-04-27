import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AmountFrame extends JFrame
{
    JLabel numLb, amountLb;
	JLabel noteLb;//
	
	JTextField numTf, amountTf;
	JButton b1, b2;
	
	//int mobNo, amount;
	
	int konta;
	SignInFrame signInFrame;
	
	void setSignInFrame(SignInFrame s)	{
		konta = 0;
		signInFrame = s;
	}
	
    AmountFrame()	{
        //setLayout(new FlowLayout());
        this.setLayout(null);
        numLb = new JLabel("Mobile Numnber:",JLabel.CENTER);
		amountLb = new JLabel("Amount:",JLabel.CENTER);
        
		numTf = new JTextField(50);amountTf = new JTextField(50);
		
        noteLb = new JLabel("",JLabel.CENTER);
		
		b1=new JButton("Proceed to Recharge");
		b2=new JButton("Back");
		//pass.setEchoChar('#');
        /*
		b1 = new Button("SIGN IN");
        b2 = new Button("SIGN UP");
        */
		
		this.add(numLb);
        this.add(amountLb);
		
        this.add(numTf);
        this.add(amountTf);
		
		this.add(noteLb);
		
		this.add(b1);this.add(b2);
		
		AmountFrameButton bk=new AmountFrameButton();bk.setAmountFrame(this);
		b1.addActionListener(bk);//b2.addActionListener(bk);
		
		
		int y = 90;
		
		int x1 = 200;int x2 = x1 + 130;
		
		int x1Width = 130;
		
        numLb.setBounds(x1, y, x1Width, 60);
		numTf.setBounds(x2, y + 20, 200, 20);
		
        amountLb.setBounds(x1, y + (40 * 1), x1Width, 60);
		amountTf.setBounds(x2, y + (40 * 1) + 20, 200, 20);
        
		b1.setBounds(x2 - 20,400,200,40);
		//b2.setBounds(x2 - 20,450,200,40);
		
		noteLb.setBounds(x2 - 20,250,200,200);
		
		setVisible(true);
        setSize(800, 600);
		setTitle("Type Mobile Number and Amount");
		
		
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
		AmountFrame b = new AmountFrame();
        
        //ml.setVisible(true);
        //ml.setSize(400,400);
        //ml.setTitle("my login window");

    }
	
}