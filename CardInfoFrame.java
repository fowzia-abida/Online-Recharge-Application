import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardInfoFrame extends JFrame
{
    JLabel numLb, pinLb;
	JLabel noteLb;//
	
	JTextField numTf, pinTf;
	JButton b1, b2;
	
	String mobNo, amount;
	
	JComboBox cBox1, cBox2, cBox3;
	JLabel bankLb, cTypeLb1, cTypeLb2;
	
	AmountFrame amountFrame;
	void setAmountFrame(AmountFrame s)	{
		amountFrame = s;
	}
	
    CardInfoFrame(String mobNo, String amount)	{
		
		this.mobNo = mobNo;this.amount = amount;
		
		String[] msgStr1 = {"Select Bank", "Brac Bank", "City Bank","DBBL"};
		cBox1 = new JComboBox(msgStr1);
		
		String[] msgStr2 = {"Select Card", "American Express Card", "ATM Card", "Master Card", "VISA Card"};
		cBox2 = new JComboBox(msgStr2);
		
		String[] msgStr3 = {"Select Catagory", "Credit", "Debit"};
		cBox3 = new JComboBox(msgStr3);
		
		bankLb = new JLabel("Bank:",JLabel.CENTER);
		cTypeLb1 = new JLabel("Card Type:",JLabel.CENTER);
		cTypeLb2 = new JLabel("Card Type:",JLabel.CENTER);
		
		
        //setLayout(new FlowLayout());
        this.setLayout(null);
        numLb = new JLabel("Card Number:",JLabel.CENTER);
		pinLb = new JLabel("Pin:",JLabel.CENTER);
        
		numTf = new JTextField(50);pinTf = new JTextField(50);
		
        noteLb = new JLabel("",JLabel.CENTER);
		
		b1=new JButton("Proceed to Recharge");b2=new JButton("Back");
		//pass.setEchoChar('#');
        /*
		b1 = new Button("SIGN IN");
        b2 = new Button("SIGN UP");
        */
		this.add(bankLb);this.add(cBox1);
		this.add(cTypeLb1);this.add(cBox2);
		this.add(cTypeLb2);this.add(cBox3);
		
		this.add(numLb);
        this.add(pinLb);
		
        this.add(numTf);
        this.add(pinTf);
		
		this.add(noteLb);
		
		this.add(b1);this.add(b2);
		
		
		CardInfoFrameButton bk=new CardInfoFrameButton();bk.setCardInfoFrame(this);
		b1.addActionListener(bk);b2.addActionListener(bk);
		
		
		int y = 90;
		
		int x1 = 200;int x2 = x1 + 130;
		
		int x1Width = 130;
		
        numLb.setBounds(x1, y, x1Width, 60);
		numTf.setBounds(x2, y + 20, 200, 20);
		
        pinLb.setBounds(x1, y + (40 * 1), x1Width, 60);
		pinTf.setBounds(x2, y + (40 * 1) + 20, 200, 20);
        
		bankLb.setBounds(x1, y + (40 * 2), x1Width, 60);
		cBox1.setBounds(x2, y + (40 * 2) + 20, 200, 20);
		
		cTypeLb1.setBounds(x1, y + (40 * 3), x1Width, 60);
		cBox2.setBounds(x2, y + (40 * 3) + 20, 200, 20);
		
		cTypeLb2.setBounds(x1, y + (40 * 4), x1Width, 60);
		cBox3.setBounds(x2, y + (40 * 4) + 20, 200, 20);
		
		
		b1.setBounds(x2 - 20,400,200,40);
		b2.setBounds(x2 - 20,450,200,40);
		
		noteLb.setBounds(x2 - 20,250,200,200);
		
		setVisible(true);
        setSize(800, 600);
		setTitle("Card Information");
		
		
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
		CardInfoFrame b = new CardInfoFrame("0123", "5");
        
        //ml.setVisible(true);
        //ml.setSize(400,400);
        //ml.setTitle("my login window");

    }
	
}