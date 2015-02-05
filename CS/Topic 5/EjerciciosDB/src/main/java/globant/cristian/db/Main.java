package globant.cristian.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Main {
	public static void main( String[] args ) throws Exception
    {
    try{
    	Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost/high_school","sqluser2","sqluserpw");
    	Statement myStmt=myConn.createStatement();
    	ResultSet myRs= myStmt.executeQuery("Select * from students where courses_id=1 ORDER BY s_l_name ASC ");
    	Statement myStmt2=myConn.createStatement();
    	ResultSet myRs2=myStmt2.executeQuery("Select * from courses where courses_id=1");
    	Statement myStmt3=myConn.createStatement();
    	ResultSet myRs3=myStmt3.executeQuery("Select * from teacher where courses_id=1");
    	
    	System.out.print("Course:");
    	while (myRs2.next()){
    		
    		System.out.println(myRs2.getString("c_name")+"\n");
    	}
    	System.out.print("Teacher:");
    	while (myRs3.next()){
    		
    		System.out.println(myRs3.getString("t_l_name")+myRs3.getString("t_f_name")+","+"\n");
    	}
    	System.out.println("Students:");
    	while (myRs.next()){
    		
    		System.out.println(myRs.getString("s_l_name")+","+myRs.getString("s_f_name"));
    	}
       	
    }catch(Exception exc){
    	exc.printStackTrace();
    }
    }
}