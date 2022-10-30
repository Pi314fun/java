import java.util.Scanner;

/*
   This program calculates the amount of pasta to cook, given the
   number of people eating.

   Author: Andrea Giada
   Date:   May 30, 2017
*/

public class PastaCalculator {
   public static void main (String [] args) {
	    Scanner scnr = new Scanner(System.in);
	    int numPeople;         // Number of people that will be eating
	    int totalOuncesPasta;  // Total ounces of pasta to serve numPeople
	    int totalGreenPeppers; // Total number of green peppers per person
	    int totalOuncesMushrooms; // Total ounces of musrooms per person
	      // Get number of people
	    System.out.println("Enter number of people: ");
	    numPeople = scnr.nextInt();

	      // Calculate and print total ounces of pasta, green peppers and mushrooms
	    totalOuncesPasta = numPeople * 3;  // Typical ounces per person
	    totalGreenPeppers = numPeople / 4; // One green pepper per 4 servings
	    totalOuncesMushrooms = numPeople * 2; // 2 ounces per person
	      
	      // Output total needed items
	    System.out.println("Cook " + totalOuncesPasta + " ounces of pasta.");
	    System.out.println("Add  " + totalGreenPeppers + " green peppers.");
	    System.out.println("Add " + totalOuncesMushrooms + " ounces of mushrooms.");
	    }
	}