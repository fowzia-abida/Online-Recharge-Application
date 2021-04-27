import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMB{
	DBMB()	{
	}
	void updBal(String s, int amount)	{
		try	{
			DataAccess da=new DataAccess();
			ResultSet rs=null;
			String q="select * from mbtable";
			rs=da.getData(q);
			while(rs.next()){
				String a = rs.getString("number");
				System.out.println(a + s);
				if(a.equals(s))	{
					int b = rs.getInt("balance");
					int tmpBalance = b + amount;
					String ss = "update mbtable set balance=" + tmpBalance + " where number='" + s + "'";
					//String q = "update mytable set Balance='bob2' where Card Number=5";
					//int c = da.updateDB(q);
					da.updateDB(ss);
					//System.out.println(ss);
					da.close();
					System.out.println("num : " + s);
					System.out.println("previous balance : " + b);
					System.out.println("new balance : " + tmpBalance);
					return;
				}
			}
			
			da.close();
		}catch(Exception e)	{}	
		System.out.println("hi2");
		return;
	}
	
    public static void main(String[] args)throws SQLException{
		DBMB dd = new DBMB();
		dd.updBal("123", 15);
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