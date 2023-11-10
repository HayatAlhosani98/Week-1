
public class Leapyear {

	public static void main(String[] args) {
		int year = 2400;
		
		
		if (year%100==0) {
			if(year%400==0) {
			System.out.print(year + " Leap Year");
		}else {
			System.out.print("Not a Leap Year");
		}
		}else {	
			if (year%4==0) {
				System.out.print("Leap Year");
				
			}else {
				System.out.print("Not a Leap Year");
			}
		}
		

		
	
	}

}
