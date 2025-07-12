package BUS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
public static void main(String args[]) throws SQLException {
    
busDAO b=new busDAO();
b.Display();
    
 Scanner scanner=new Scanner(System.in);
    int n=1;
    while(n==1) {
    	 
    	 System.out.println("Enter 1 for booking 2 for exit .. = " );
 
    	 n=scanner.nextInt();
    	 if (n==1) {
    		 Booking book= new Booking();
    		 if (book.isAvailable()) {
    			BookingDAO bookingDAO=new BookingDAO();
    			bookingDAO.add(book);
    			System.out.println("Successfully added");
    		}
    		 else {
    				System.out.println("Already full please select another date");
    			}
		}
    	 
	}

}
}
