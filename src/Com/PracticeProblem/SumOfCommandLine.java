package Com.PracticeProblem;

import java.util.Scanner;

public class SumOfCommandLine {

	public static void main(String[] args) {
		// Sum of command line arguments
		
		 //using scanner to get user input
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter the value a:");
		 int a = sc.nextInt();
		 System.out.println("Enter the value b:");
		 int b = sc.nextInt();
		 int sum = a + b;
		 
		 //if statement to print integer or not
		 if(sum >0) {
			 System.out.println("Sum \'" + sum + "\' is a integer");
		 }else {
			 System.out.println("sum of the numbers is not integer");
		 }

	}

}
