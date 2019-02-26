
    import java.util.Scanner;
import java.sql.*;
	public class UpdateDemo {

		public static void main(String[] args) {
			Connection con;
			PreparedStatement pstmt;
			int rs;
			int cnt=0;
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
	        con = DriverManager.getConnection("jdbc:MySql://localhost:3307/classicmodels","root","aktdxt217");
	        
	        String sqlUpdate = "UPDATE employees "+ "SET stream + ?" + "WHERE employeesNumber = ?";
	        pstmt = con.prepareStatement(sqlUpdate);
	        
	        Scanner s=new Scanner(System.in);
	        
	        System.out.println("enter Employeed Id: ");
	        int eid=s.nextInt();
	        s.nextLine();
	        System.out.println("enter new Job Title :");
	        String strm=s.nextLine();
	        
	        pstmt.setString(1, strm);
	        pstmt.setInt(2, eid);
	      
	        int rowAffected = pstmt.executeUpdate();
	        System.out.println("Row affected"+ rowAffected);
	        
	        strm = "Sales Head";
	        eid = 1370;
	        pstmt.setString(1, strm);
	        pstmt.setInt(2, eid);
	        
	        rowAffected = pstmt.executeUpdate();
	        System.out.println("RowAffected"+ rowAffected);
	      con.close();
		}
			catch(Exception ce)

			{

				System.out.println(ce);

			}
		}
	}





