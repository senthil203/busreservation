package busreservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
public static void main(String args[]) {
	ArrayList<Bus> buses=new ArrayList<Bus>();//ArrayList-collection
	ArrayList<Booking> bookings=new ArrayList<Booking>();
	buses.add(new Bus(1,true,1));
	buses.add(new Bus(2,false,2));
	buses.add(new Bus(3,false,3));
	
int userOpt=1;
	Scanner sc=new Scanner(System.in);
	for(Bus b:buses) {
		b.displayBusinfo();
	}
	while(userOpt==1){
	     System.out.println( "Enter 1 to book and 2 to exit");
	     userOpt=sc.nextInt();
	     if(userOpt==1) {
	    	 Booking booking=new Booking();
	    	 if(booking.isAvailable(bookings,buses)) {
	    		 bookings.add(booking);
	    		 System.out.println("Your booking is confirmed");
	    		 System.out.println("-_- -_-HAPPY JOURNEY-_- -_-");
	    	 }
	    	 else
	    		 System.out.println("Sorry.Bus is full.Try another bus or date.");
	     }
     }
 }
}
    