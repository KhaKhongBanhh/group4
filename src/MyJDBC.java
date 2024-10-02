import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection cn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306",
			"root",
			"admin"
				);
	}

}
