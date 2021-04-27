import java.awt.*;
import java.awt.event.*;

class CardInfoFrameButton implements ActionListener
{
	
	CardInfoFrame cardInfoFrame;
	void setCardInfoFrame(CardInfoFrame s)	{
		cardInfoFrame = s;
	}
	
	public void actionPerformed(ActionEvent a){
		
		String str = a.getActionCommand();
		if(str.equals("Back"))	{
			cardInfoFrame.amountFrame.setVisible(true);
			cardInfoFrame.setVisible(false);
			cardInfoFrame.dispose();
			return;
		}
		
		//System.out.println(a.getActionCommand());
		String shy1 = cardInfoFrame.numTf.getText();
		String shy2 = cardInfoFrame.pinTf.getText();
		if(shy1.equals("") || shy2.equals(""))	{
			//System.out.println("empty bruh");
			cardInfoFrame.changeNoteLb("empty bruh");
			return;
		}
		
		String strBox1 = (String)cardInfoFrame.cBox1.getSelectedItem();//
		String strBox2 = (String)cardInfoFrame.cBox2.getSelectedItem();
		String strBox3 = (String)cardInfoFrame.cBox3.getSelectedItem();
		
		
		BankAccountHandler bah = new BankAccountHandler();
		if(!bah.checkValidity(shy1, shy2, strBox1, strBox2))	{//card num, pin num, bank, card type
			cardInfoFrame.changeNoteLb("information nor right bruh");
			return;
		}
		
		if(strBox3.equals("Debit") && !bah.checkAmount(shy1, Integer.parseInt(cardInfoFrame.amount)))	{
			cardInfoFrame.changeNoteLb("Not Sufficient Amount bruh");
			return;
		}
		
		bah.porerKaj(shy1, strBox3, Integer.parseInt(cardInfoFrame.amount), cardInfoFrame.mobNo);
		
		bah.createFrame();
		cardInfoFrame.setVisible(false);
		cardInfoFrame.dispose();
		
		
		
		//System.out.println(strBox1);
		//cardInfoFrame.mobno = shy1;cardInfoFrame.pin = shy2;
		
		//System.out.println("Button Pressed");
	}
}