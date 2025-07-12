package BUS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BookingDAO {
public int getBooked(int n,Date date) throws SQLException {
	String string="select count(nme) from booking where  num=? and dat=?";
	DbConnection dbConnection=new DbConnection();
	Connection connection=dbConnection.getConnection();
	PreparedStatement statement=connection.prepareStatement(string);
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	statement.setInt(1,n);
	statement.setDate(2, sqldate);
	ResultSet resultSet=statement.executeQuery();
	resultSet.next();
	return resultSet.getInt(1);
}
public void add(Booking b) throws SQLException {
	String string="insert into booking values(?,?,?)";
	DbConnection dbConnection=new DbConnection();
	Connection connection=dbConnection.getConnection();
	PreparedStatement statement=connection.prepareStatement(string);
	
	statement.setString(1, b.passengerNameString);
	statement.setInt(2, b.Busno);
	java.sql.Date sqlDate=new java.sql.Date(b.date.getTime());
	statement.setDate(3,sqlDate);
	statement.executeUpdate();
}
}
