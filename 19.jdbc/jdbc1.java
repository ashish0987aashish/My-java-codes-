import java.sql.*;

class Test
{

 public static void main(String[] args) throws Exception
 {
 
 	Class.forName("oracle.jdbc.OracleDriver"); 

 	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");

	 if(con!=null)
 	{
  		System.out.println("Yes! connected...");
 	}

 	else 
 	{
  		System.out.println("Not connected... ");
 	}	
  
        Statement st = con.createStatement();
        st.executeUpdate("create table studentdata(roll number(10), name varchar2(10))");
       
        System.out.println("Yes ! table created sucessfully");


        st.executeUpdate("insert into studentdata values(1,'a')");
        st.executeUpdate("insert into studentdata values(10,'Rahul')");
        st.executeUpdate("insert into studentdata values(20,'Rajesh')");
        
    
         
        System.out.println(" insertion sucessful");
         
  

   

  }
} 