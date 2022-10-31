package SRS;

import java.sql.*;

import javax.swing.JOptionPane;
public class srs {
		public  void run_srs()  //method
		{
			String url="jdbc:postgresql://localhost/POS_APP";
	    	String user="postgres";
	    	String password="postgres";
	    	String srs_sql="copy (select * from inventory where min_quantity <= actual_quantity ORDER BY id) to 'D:/reorderlist.csv' DELIMITER ',' CSV HEADER";
	    	try(Connection con=DriverManager.getConnection(url,user,password))
	   		{
	    		Statement stmt=con.createStatement();
	    		stmt.executeQuery(srs_sql);
	    		//System.out.println("1");
	    		con.close();
	   		}
	    	catch(Exception e)
	    	{
	    	
	    	}
		}
		
		public static void main(String args[])
		{
		  srs exe=new srs();	
		  exe.run_srs();
		}
}
