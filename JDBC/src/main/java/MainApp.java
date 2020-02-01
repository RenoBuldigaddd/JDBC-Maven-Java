import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {

		try {
			Connection conn = GetConnection();
			if (conn != null) {
				System.out.println("Підключення успішне");
			} else {
				System.out.println("Проблеми при підключенні");
			}

		} catch (Exception e) {
			System.out.println("У нас проблеми " + e.getMessage());
		}

	}

	private static Connection GetConnection() throws SQLException, ClassNotFoundException {
		String hostName = "10.7.24.196";
		String dbName = "paraskadb";
		String userName = "vova";
		String password = "Qwerty1-";

		Class.forName("org.postgresql.Driver");

		Connection conn = DriverManager.getConnection("jdbc:postgresql://" + hostName + ":5432/" + dbName, userName,
				password);
		return conn;
	}
}