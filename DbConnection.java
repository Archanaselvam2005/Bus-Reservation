package BUS;

import java.sql.*;

public class DbConnection {
private static final String urlString="jdbc:mysql://localhost:3306/busreservarion";
private static final String name="root";
private static final String  pass="Archana@18";

	Connection getConnection() throws SQLException {
		return DriverManager.getConnection(urlString, name, pass);
	}
}
