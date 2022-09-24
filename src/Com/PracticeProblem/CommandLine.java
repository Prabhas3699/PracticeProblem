package Com.PracticeProblem;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		// name using commandLine argument
		
		//using scanner to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the command line:");
		String words=sc.nextLine();
		System.out.println("Your CommandLine Argument is: "+words);  

	}

}
