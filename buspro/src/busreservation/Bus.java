package busreservation;

public class Bus {
	 int busNo;
	 boolean ac;
	 int capacity;//get and set
	
	Bus(int no,boolean ac ,int cap){
		this. busNo=no;
		this.ac=ac;
		this.capacity=cap;
		}
	public int getBusNo() {
		return busNo;
		
 }	public boolean isAc() {
		return ac;
		
	}
	public int getCapacity() {   //accessor method
		return capacity;
	}
	public void setAc(boolean val) { //mutator method
		ac=val;
	}
	public void setCapacity(int cap) {
		//capacity=cap;
	}
	
public void displayBusinfo() {
		
				
		System.out.println("Bus no:" +busNo+"  Ac:"+ac+" total capacity:"+capacity);
	}

}
