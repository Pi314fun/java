import java.util.Scanner;

public class avgHouse{		
	
	public static void main(String[] arguments) {

    Scanner scnr = new Scanner(System.in); // setting up inputs and outputs
    
    String neighName; //Saves neighborhood name
    Boolean likeAnother = true; //Boolean to run the while loop
    int sumTotal = 0; //Total values entered added together
    String yOrn = ""; // Yes or No string for the y or n input
    int x = 0; // Loop counter to find average
    int avgTotal = 0; // Total of sumTotal / x 
    
    System.out.println("Welcome to my real estate average price calculator!"); //friendly greeting
    System.out.println("Enter the name of the neighborhood:"); 
    neighName = scnr.nextLine(); // Assigning neighborhood name into string variable
        
        while (likeAnother) { // loop to run while likeAnother is true
            System.out.println("Would you like to add the price of one more house?");
            yOrn = scnr.next(); // yOrn assumes the value of the input 
            
            if (yOrn.equals("y")){ //comparing the string value in yOrn to the userinput looking for a y
                System.out.println("Enter house price:");
                sumTotal =  scnr.nextInt() + sumTotal; //running total of entered values
                x = x + 1; //Number of values entered
            }
            
            else if (yOrn.equals("n")) { // comparing the string value in yOrn to the userinput looking for a n
                likeAnother = false;
            }
            }
        
        avgTotal = sumTotal / x ; //finding the average home price
        
        System.out.println("The average house price in the " + neighName + " neighborhood is " + avgTotal);
        // output message for the neighborhood and average price
        System.out.println("Thanks for using the App!"); //kind departure

}
    }	

