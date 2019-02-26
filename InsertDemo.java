import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
        con = DriverManager.getConnection("jdbc:MySql://localhost:3307/classicmodels","root","aktdxt217");
        
        //String str = "insert into departments values (300, 'Travel', '200', 1700)";
        String str = "insert into offices values('8','Bangalore','+91 650 219 3456','Mg Road','Utility Building','KA','INDIA','56001','NA' )";
        
        stmt=con.createStatement();
        int rowcount = stmt.executeUpdate(str);
        if(rowcount>0)
        {
        	System.out.println("Record Inserted Succefully");
        }
        String str1 = "Select count(officecode) from offices";
        rs=stmt.executeQuery(str1);
        while(rs.next())
        {
        	cnt=rs.getInt(1);
        }
        System.out.println("Total no. of records is: "+cnt);
        con.close();
	}
		catch(Exception e)

		{

			System.out.println(e);

		}
	}
}

