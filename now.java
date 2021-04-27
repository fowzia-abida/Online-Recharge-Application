import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class now extends JFrame
{   
    JLabel noteLb;
	JButton b1;
	
	now()	{
        //setLayout(new FlowLayout());
        this.setLayout(null);
		noteLb = new JLabel("Tranzaction Complete Successfully",JLabel.CENTER);
		b1=new JButton("Finish");
	   
	    this.add(noteLb);
		this.add(b1);	

       nowbutton bk=new nowbutton();
		bk.setLastFrame(this);
		b1.addActionListener(bk);
		
		noteLb.setBounds(150, 100, 250, 60);
	    b1.setBounds(150,300,250,50);
		
		setVisible(true);
        setSize(600,400);
		setTitle("Online Recharge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		  public static void main(String args[])
    {
		now o = new now();
        
    }
	
}
	