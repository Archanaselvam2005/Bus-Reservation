package BUS;
import java.sql.*;
public class busDAO {

public void Display() throws SQLException {
	String queryString="select * from bus";
	DbConnection dbConnection=new DbConnection();
	Connection connection=dbConnection.getConnection();
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery(queryString);
	while (resultSet.next()) {
	System.out.println("Bus no is "+resultSet.getInt(1));
	if (resultSet.getBoolean(2)) {
		System.out.println("Bus is AC Bus");
	} else {
		System.out.println("Bus is not AC Bus");
	}
	System.out.println("Capacity is "+resultSet.getInt(3));
	}
	
}
public int getCapacity(int n) throws SQLException {
	String string="select cap from bus where id ="+n;
	DbConnection dbConnection=new DbConnection();
	Connection connection=dbConnection.getConnection();
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery(string);
	resultSet.next();
	return resultSet.getInt(1);
}

}
