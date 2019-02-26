    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.*;
	public class DeleteDemo {

		public static void main(String[] args) {
			Connection con;
			Statement stmt;
			ResultSet rs;
			int cnt=0;
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
	        con = DriverManager.getConnection("jdbc:MySql://localhost:3307/classicmodels","root","aktdxt217");
	        
	        String str = "Delete from offices where city='Noida';";
	        System.out.println(" ");
	      
	        stmt=con.createStatement();
	        cnt = stmt.executeUpdate(str);
	        if(cnt>0)
	        {
	        	System.out.println("Record deleted");
	        }
	      
	        con.close();
	        System.out.println("Total no. of records is: "+cnt);
	       
		}
			catch(Exception ce)

			{

				System.out.println(ce);

			}
		}
	}



