package Com.PracticeProblem;

public class TwoStrings {
	public static void main (String[] args) {
		
		// Two string equal or not 

		//initiating string variables
		String string1 = "Hello World";
        String string2 = "welcome";
        
        //printing the length of the strings
        System.out.println(string1.length());
        System.out.println(string2.length());
        
        //ckecking for equal or not using if condition
        if (string1.length()==string2.length()) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is not equal to String 2");
        }

	
		
	}
}
