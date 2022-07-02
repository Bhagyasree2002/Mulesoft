import java.sql.*;
public class favorite {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306//fav_movie";
		String user_name = "root";
		String password = "200229";
		String query = "SELECT m_name FROM fav_movie;";
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection c = DriverManager.getConnection( "jdbc:mysql//localhost:3306//fav_movie ","root","200229");
	Statement s = c.createStatement();
	ResultSet r = s.executeQuery(query);
	
	String str = "";
	while(r.next()) {
		str = r.getString(1);
		System.out.println(str);
	}
	s.close();
	c.close();
	}

}