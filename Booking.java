package BUS;

import java.util.*;
import java.sql.SQLException;
import java.text.*;
public class Booking {
	String  passengerNameString;
	int Busno;
	Date date;
	 Booking() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Passenger name = ");
		passengerNameString= scanner.nextLine();
		System.out.println("Enter Busno = ");
		Busno= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter date in dd-mm-yyyy = ");
		String dateInput=scanner.nextLine();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date= dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public boolean isAvailable() throws SQLException {
		busDAO b=new busDAO();
		int capacity=b.getCapacity(Busno);
		BookingDAO bookingDao=new BookingDAO();
		int booked=bookingDao.getBooked(Busno,date);
		
		
		return capacity>booked;
	}
	

}
