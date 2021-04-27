import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MobileFrame extends JFrame
{
    JLabel codeLb;//
	
	JButton b1;
	
	//int mobNo, amount;
	
    MobileFrame(int random)	{
        //setLayout(new FlowLayout());
        this.setLayout(null);
        codeLb = new JLabel("Your Confirmation Code is " + random, JLabel.CENTER);
		
		
		b1=new JButton("OK");
		//pass.setEchoChar('#');
        /*
		b1 = new Button("SIGN IN");
        b2 = new Button("SIGN UP");
        */
		
		this.add(codeLb);
        
		this.add(b1);
		
		/*
		AmountFrameButton bk=new AmountFrameButton();
		
		AmountFrameButton bk=new AmountFrameButton();bk.setAmountFrame(this);
		*/
		b1.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				setVisible(false);
				dispose();
			}
		});
		
		
		int y = 90;
		
		int x1 = 200;int x2 = x1 + 130;
		
		int x1Width = 350;
		
        codeLb.setBounds(x1 + 15, y, x1Width, 150);
		
		b1.setBounds(x2 - 20,450,200,40);
		
		
		setVisible(true);
        setSize(800, 600);
		setTitle("Confirmation Code");
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/*
		WindowKeeper wk=new WindowKeeper();
	    addWindowListener(wk);
		*/
    } 
	
    public static void main(String args[])
    {
		MobileFrame b = new MobileFrame(1111);
        
        //ml.setVisible(true);
        //ml.setSize(400,400);
        //ml.setTitle("my login window");

    }
	
}