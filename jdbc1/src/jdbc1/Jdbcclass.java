package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 

public class Jdbcclass {
	
	public static void main(String[] args) throws Exception,SQLException
	{
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/saad","root","welcome");  
			  
			Statement st=con.createStatement();  
			
		//	String name = "Rahul";
		//	int roll_number = 106;
		  //  String address = "Agra";
		//    String clas = "10th E";
		//    int fees=1800;
		//    String record = "INSERT INTO student (name, roll_number, address, clas,fees)" + 
        //            "VALUES ('"+name+"',+"+roll_number+",'"+address+"','"+clas+"',+ "+fees+")";
			ResultSet set=st.executeQuery("select * from student");  
			  
			while(set.next()) 
			
			System.out.println(set.getString(1)+"  "+set.getInt(2)+"  "+set.getString(3) +" "+set.getString(4)+ " "+set.getInt(5) );  
			  
			//con.close();  
		 //   st.executeUpdate(record);
		  //  System.out.println("inserted");
		    con.close();
		    
			  
		}
		} 
		
	}

