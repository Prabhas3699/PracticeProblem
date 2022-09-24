package Com.PracticeProblem;

public class LeapYear {

	public static void main(String[] args) {
		// given year is leap year or not
		
		//instance variable
		int year = 1582;
		
		//if condition
		if (year%4 == 0 && year%100 !=0 || year%400 == 0 ) {
			System.out.println("The Year is Leap Year");
		}else {
			System.out.println("The Year is not a Leap Year");
		}

	}

}
