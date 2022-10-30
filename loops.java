import java.util.Scanner;

public class loops{		
	
	public static void main(String[] arguments) {
		
	Scanner scnr = new Scanner(System.in);	// creating input and output

    int i = 0; //counter variable
    String inputStatement; //declaring for input statement
    
    System.out.println("Enter a statement you want me to repeat!"); //outputing task
    inputStatement = scnr.nextLine(); // collecting the input and assigning it 
    System.out.println("Enter how many times you want me to print it?"); //outputing a value to reapeat
    int x = scnr.nextInt(); //collecting user input

        while (i < x) {   //loop
            i = i + 1;  // loop counter
            System.out.println(inputStatement); //repeating statement
        }
	System.out.println("Well said! good bye!") //kind program ending
    }
    
}
