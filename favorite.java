import java.sql.*;
public class favorite {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306//fav_movie";
		String user_name = "root";
		String password = "200229";
		String m_name = "Bahubali";
            String actor_name = "Prabhas";
		String actress_name = "Anuskha";
		String director_name = "Rajamouli";
		String query = "insert into fav_movie values(?,?,?,?)"
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection c = DriverManager.getConnection( "jdbc:mysql//localhost:3306//fav_movie ","root","200229");
	PreparedStatement s = c.preparecreateStatement();
	s.SetString(1, m_name);
      s.SetString(2, actor_name);
	s.SetString(3,actress_name);
	s.SetString(4,director_name);
	int cnt = s.executeUpdate();
	System.out.println(cn); 
	s.close();
	c.close();
	}

}