import java.sql.ResultSet;
import java.sql.SQLException;

public class DBBankAccount{
	DBBankAccount()	{
	}
	boolean checkValidity(String cardNum, String pinNum, String bankName, String cardType)	{//if available return 1 else 0
		try	{
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			String q="select * from dbtable";
			rs=da.getData(q);
			while(rs.next()){
				String a = rs.getString("CardNumber");
				String b = rs.getString("PinNumber");
				String c = rs.getString("BankName");
				String d = rs.getString("CardType");
				if(a.equals(cardNum) && b.equals(pinNum) && c.equals(bankName) && d.equals(cardType))	{
					da.close();
					return true;
				}
				/*
				System.out.println(a + " " + b +  " " + c + " " + d);
				System.out.println(cardNum + " " + pinNum +  " " + bankName + " " + d);
				*/
			}
			da.close();
		}catch(Exception e)	{}	
		
		return false;
	}
	
	
	boolean checkAmount(String cardNum, int amount)	{
		try	{
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			String q="select * from dbtable";
			rs=da.getData(q);
			while(rs.next()){
				String a = rs.getString("CardNumber");
				int b = rs.getInt("Balance");
				if(a.equals(cardNum))	{
					if(b < amount)	{
						return false;
					}
					da.close();
				}
			}
			da.close();
		}catch(Exception e)	{}
		return true;
	}
	
	void updateAmount(String cardNum, int amount)	{
		try	{
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			String q="select * from dbtable";
			rs=da.getData(q);
			while(rs.next()){
				String a = rs.getString("CardNumber");
				int b = rs.getInt("Balance");
				if(a.equals(cardNum))	{
					int tmpBalance = b - amount;
					String ss = "update dbtable set Balance=" + tmpBalance + " where CardNumber='" + cardNum + "'";
					//String q = "update mytable set Balance='bob2' where Card Number=5";
					//int c = da.updateDB(q);
					da.updateDB(ss);
					//System.out.println(ss);
					da.close();
				}
			}
			da.close();
		}catch(Exception e)	{}
	}
	
	void updateCreditAmount(String cardNum, int amount)	{
		try	{
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			String q="select * from dbtable";
			rs=da.getData(q);
			while(rs.next()){
				String a = rs.getString("CardNumber");
				int b = rs.getInt("CBalance");
				if(a.equals(cardNum))	{
					int tmpBalance = b + amount;
					System.out.println(b + " " + " " + amount);
					//System.out.println(tmpBalance);
					//String ss = "update dbtable set Cbalance=" + tmpBalance + " where Balance=10";
					//String ss = "update dbtable set CBalance=" + tmpBalance + " where CardNumber='123'";
					String ss = "update dbtable set CBalance=" + tmpBalance + " where CardNumber='" + cardNum + "'";
					//String q = "update mytable set Balance='bob2' where Card Number=5";
					//int c = da.updateDB(ss);
					//System.out.println(ss);
					da.updateDB(ss);
					da.close();
				}
			}
			da.close();
		}catch(Exception e)	{}
	}
	
    public static void main(String[] args)throws SQLException{
		DBBankAccount dd = new DBBankAccount();
		/*
		boolean tmp = dd.checkEmail("tb@gmail.com");
		System.out.println(tmp);
		tmp = dd.checkEmail("sa");
		System.out.println(tmp);
		*/
		/*
		boolean tmp = dd.checkPass("tb@gmail.com", "rara");
		System.out.println(tmp);
		tmp = dd.checkPass("tb@gmail.com", "tb");
		System.out.println(tmp);
		*/
        // TODO code application logic here
		/*
        DataAccess da=new DataAccess();
        ResultSet rs=null;
		String q="select * from mytable";
        rs=da.getData(q);
		String nm="tb@gmail.com";
        while(rs.next()){
            //int id = rs.getInt("id");
            String a = rs.getString("email");
			String b = rs.getString("pass");
			System.out.println(a);
			System.out.println(b);
			
			if(n.equals(nm)){
				System.out.println("found");
			}
			
			//String l = rs.getString("location");
            //System.out.println(n+" from : "+l);
            //System.out.println("ID of "+n+" is : " + id);
        }
		*/
        /*String q="select * from mytable";
        rs=da.getData(q);
		String nm="abc";
        while(rs.next()){
            int id = rs.getInt("id");
            String n = rs.getString("name");
			if(n.equals(nm)){
				System.out.println("found");
			}
			String l = rs.getString("location");
            System.out.println(n+" from : "+l);
            //System.out.println("ID of "+n+" is : " + id);
        }
        da.close();*/
        
        /*String q="insert into mytable values(5,'another','raj')";
        int c=da.updateDB(q);
        da.close();*/
		/*int id=2;
        String q="delete from mytable where id="+id;
        System.out.println(q);
		int c=da.updateDB(q);*/
		/*
        String q="update mytable set name='bob2' where id=5";
        int c=da.updateDB(q);
		da.close();
		*/
        
        //System.out.println(rs.toString());
    }
}