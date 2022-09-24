package Com.PracticeProblem;

public class Static {
	
	//to demonstrate Static Variable,Method and Block
	
	//static method
    public static void main(String[] args) {

       //initiating variables
       int x = 5;
       int y = x+6;
       int z = x + y;

       //block
       {
           System.out.println("x =" + x);
           System.out.println("y =" + y);
           System.out.println("z =" + z);
       }
    }
}
