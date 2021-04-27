import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BankAccountHandler extends JFrame
{
    DBBankAccount dd;
	
	JLabel codeLb;
	JLabel noteLb;//
	
	JTextField codeTf;
	JButton b1;
	
	String cNum;String cType;int amount;int random;
	
	MobileFrame mff;
	
	String mobno;
	
    BankAccountHandler()	{
        dd = new DBBankAccount();
		
    }
	
	
	void createFrame()	{
		
		this.setLayout(null);
        codeLb = new JLabel("Insert Code:",JLabel.CENTER);
		noteLb = new JLabel("Thank You:",JLabel.CENTER);
        
		codeTf = new JTextField(50);
		
		b1=new JButton("Press");
		
		this.add(codeLb);
        this.add(codeTf);
		this.add(noteLb);
		
		this.add(b1);
		
		
		b1.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				//setVisible(false);
				//dispose();
				
				String txt = codeTf.getText();
				System.out.println(txt);
				if(txt.equals(""))	{
					changeNoteLb("empty bruh");
					return;
				}
				
				
				if(random == (int)Integer.parseInt(txt))	{
				}
				else	{
					changeNoteLb("Confirmation code not right bruh");
					return;
				}
				
				if(cType.equals("Debit"))	{
					updateAmount(cNum, amount);
				}
				else	{
					System.out.println("amount1 : " + amount);
					updateCreditAmount(cNum, amount);
					//bah.updateAmount(Integer.parseInt(cardInfoFrame));
				}
				System.out.println("hoise vha");
				mff.setVisible(false);mff.dispose();
				setVisible(false);dispose();
				DBMB dbmb = new DBMB();
				dbmb.updBal(mobno, amount);
				now o = new now();
			}
		});
		/*
		AmountFrameButton bk=new AmountFrameButton();bk.setAmountFrame(this);
		b1.addActionListener(bk);
		*/
		
		int y = 90;
		
		int x1 = 200;int x2 = x1 + 130;
		
		int x1Width = 130;
		
        codeLb.setBounds(x1, y, x1Width, 60);
		codeTf.setBounds(x2, y + 20, 200, 20);
		
        
		b1.setBounds(x2 - 20,450,200,40);
		
		noteLb.setBounds(x2 - 20,300,200,200);
		
		setVisible(true);
        setSize(800, 600);
		setTitle("Bank Account Handler");
		
		
		random = (int)(Math.random() * 9999 + 1000);
		mff = new MobileFrame(random);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void porerKaj(String cNum, String cType, int amount, String mobno)	{
		this.cNum = cNum;this.cType = cType;this.amount = amount;this.mobno = mobno;
	}
	boolean checkValidity(String cardNum, String pinNum, String bankName, String cardType)	{
		return dd.checkValidity(cardNum, pinNum, bankName, cardType);
	}
	
	void updateAmount(String cardNum, int amount)	{
		dd.updateAmount(cardNum, amount);
	}
	void updateCreditAmount(String cardNum, int amount)	{
		System.out.println("amount2 : " + amount);
		dd.updateCreditAmount(cardNum, amount);
	}
	
	boolean checkAmount(String cardNum, int amount)	{
		return dd.checkAmount(cardNum, amount);
	}
	/*
	getCardType()	{
		
	}
	*/
	void changeNoteLb(String ss)	{
		noteLb.setText(ss);
	}
    public static void main(String args[])
    {
		BankAccountHandler b = new BankAccountHandler();
		//b.updateCreditAmount("123", 10);
		b.updateAmount("123", 11);
        b.updateAmount("123", 10);
		//b.createFrame();
    }
	
}