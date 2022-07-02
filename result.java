import java.sql.*;
public class favorite {
	public static void main(String[] args) {
	 try
	    {  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        Connection c=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/mulesoft","root","200229");  

	        Statement s=con.createStatement();  
	        ResultSet r=s.executeQuery("select * from fav_movie");  
	        while(r.next())  
	        System.out.println(r.getString(1)+" : "+r.getString(2)+" : "+r.getString(3)+" : "+ r.getString(4)+ " : "+r.getString(5) );
	        c.close();
	    }

	    catch(Exception e)
	    {
	        System.out.println(e);
	    }

}  

}