import java.util.Scanner;

public class calcprog{		
	
	public static void main(String[] arguments) {

    Scanner scnr = new Scanner(System.in); // enabling input and outputs
    Double sumTotal = 0.0;  // total variable as a double to be more accurate
    int i = 0;   // counting 
    int x = 0;   // user imput
    Double avgTotal = 0.0; // average as a double 

    System.out.println("Welcome to my Calculator program!"); //kind greeting
    System.out.println("Enter the number of integers to calculate the sum for:"); //prompting for input
    x = scnr.nextInt(); // adding a value to x
        
    
        while (i < x) { // loop
            System.out.println("Enter a number:"); // loop prompt for input
            sumTotal = scnr.nextDouble() + sumTotal; // running total of inputs collecting them as doubles
            i = i + 1;  // counter + 1
        }
        
        
        avgTotal = sumTotal / x ; // math to work out the average
        System.out.println("The sum of your numbers is " + sumTotal); //output for total entered
        System.out.println("The average of those " + x + " numbers is " + avgTotal); // output for numbers entered and average

}
    }	