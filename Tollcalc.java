
zyBooks

    My library
    >
    SENG 101: Computer Programming 1 home
    >
    3.10: Example: Toll calculation

zyBooks catalog
Help/FAQ
Thomas Cox
3.9 Order of evaluation
3.10 Example: Toll calculation
Calculating toll based on time of day

The section presents an example program that calculates the toll amount for travel along a toll road or toll lane. The toll amount is based on the time of day, day of the week, and number of people in the vehicle.

The initial version of the program calculates the toll amount for travel on a weekday based upon the toll schedule below. The table lists times in both am/pm format and 24-hour format.
Table 3.10.1: Weekday toll schedule.
Time (am/pm) 	Time (24 hour) 	Toll amount
Before 6:00 am 	Before 6:00 	1.55
6:00 am to 9:59 am 	6:00 to 9:59 	4.65
10:00 am to 5:59 pm 	10:00 to 17:59 	2.35
6:00 pm and after 	18:00 and after 	1.55

The program gets the time of travel from the user using 24 hours format, and uses the hour to determine the toll amount. A multi-branch if-else statement is used to determine in which range the hour belongs and assigns tollAmount with the toll based on the table above, and outputs the toll.
Figure 3.10.1: Calculating toll based on time of day.

import java.util.Scanner;

public class TollCalc {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int timeHour;      // Time of travel hour (24 hour format)
      int timeMinute;    // Time of travel minute
      int inputColon;    // Used to read time format
      String userInput;  // User specified time
      double tollAmount;
   
      System.out.print("Enter time of travel (HH:MM in 24 hour format): ");

      // Read an integer (hour), colon (char), and integer (minute)
      // with built-in string operators (discussed elsewhere)      
      userInput = scnr.nextLine();
      inputColon = userInput.indexOf(":");
      timeHour = Integer.parseInt(userInput.substring(0, inputColon));
      timeMinute = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length()));
   
      // Determine toll based on hour of travel
      if (timeHour < 6) {         // Before 6:00 am
         tollAmount = 1.55;
      }
      else if (timeHour < 10) {   // 6 am to 9:59 am
         tollAmount = 4.65;
      }
      else if (timeHour < 18) {   // 10 am to 5:59 pm
         tollAmount = 2.35;
      }
      else {                      // 6 pm and after
         tollAmount = 1.55;
      }
   
      // Output time and toll amount
      System.out.print("Toll at " + timeHour + ":");
   
      // Output minute with formatting (discussed elsewhere) to
      // print two digits for minutes.
      System.out.print(String.format("%02d", timeMinute));
      System.out.print(" is " + tollAmount);
   }   
}


Enter time of travel (HH:MM in 24 hour format): 9:30
Toll at 9:30 is 4.65

participation activity
3.10.1: Toll calculation.

For the given input, what is the final value of tollAmount?
1)
5:45
2)
9:45
3)
10:00
4)
22:15
Calculating toll based on time of day and day of week

A toll road often has a different toll schedule for weekends and holidays than for weekdays. The table below lists the toll schedule for weekends and holidays.
Table 3.10.2: Toll schedule for weekends and holidays.
Time (am/pm) 	Time (24 hour) 	Toll amount
Before 8:00 am 	Before 8:00 	1.55
8:00 am to 11:59 am 	8:00 to 11:59 	3.05
12:00 pm to 3:59 pm 	12:00 to 15:59 	3.45
4:00 pm to 6:59 pm 	16:00 to 18:59 	3.60
7:00 pm to 9:59 pm 	19:00 to 21:59 	3.05
10:00 pm and after 	22:00 and after 	1.55

The revised program below additionally gets the type of day from the user (0 for weekdays, and 1 for weekends or holidays). The program uses nested if-else statements to calculate the toll amount. The outer if-else checks if the today is a weekday or weekend/holiday. The nested if-else statements implement the respective toll schedules by determining the appropriate toll based on the hour of travel.

The program also uses if-else statements to output the time of travel using am/pm format instead of 24-hour format.
Figure 3.10.2: Calculating toll based on time of day and day of week.

import java.util.Scanner;
 
public class TollCalc {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int timeHour;      // Time of travel hour (24 hour format)
      int timeMinute;    // Time of travel minute
      int typeOfDay;     // 0 - weekday, 1 - weekend/holiday
      int inputColon;    // Used to read time format
      String userInput;  // User specified time
      double tollAmount;
   
      System.out.print("Enter time of travel (HH:MM in 24 hour format): ");
 
      // Read an integer (hour), colon (char), and integer (minute)
      // with built-in string operators (discussed elsewhere)      
      userInput = scnr.nextLine();
      inputColon = userInput.indexOf(":");
      timeHour = Integer.parseInt(userInput.substring(0, inputColon));
      timeMinute = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length()));
 
      System.out.print("Enter type of day (0 - weekday, 1 - weekend/holiday): ");
      typeOfDay = scnr.nextInt();
   
      if (typeOfDay == 0) { // Weekday time and rates
                            // Determine toll based on hour of travel
         if (timeHour < 6) {         // Before 6:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 10) {   // 6 am to 9:59 am
            tollAmount = 4.65;
         }
         else if (timeHour < 18) {   // 10 am to 5:59 pm
            tollAmount = 2.35;
         }
         else {                      // 6 pm and after
            tollAmount = 1.55;
         }
      }
      else { // Weekend/holiday time and rates
             // Determine toll based on hour of travel
         if (timeHour < 8) {         // Before 8:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 12) {   // 8 am to 11:59 am
            tollAmount = 3.05;
         }
         else if (timeHour < 16) {   // 12 pm to 3:59 pm
            tollAmount = 3.45;
         }
         else if (timeHour < 19) {   // 4 pm to 6:5 9pm
            tollAmount = 3.60;
         }
         else if (timeHour < 22) {   // 7 pm to 9:59 pm
            tollAmount = 3.05;
         }
         else {                      // 10 pm and after
            tollAmount = 1.55;
         }
      }
   
      // Output toll using am/pm format
      System.out.print("Toll at ");
   
      // Output hour adjusting for am/pm format
      if (timeHour == 0) {
         System.out.print("12:");
      }
      else if (timeHour <= 12) {
         System.out.print(timeHour + ":");
      }
      else {
         System.out.print((timeHour - 12) + ":");
      }
   
      // Output minute with formatting (discussed elsewhere) to
      // print two digits for minutes.
      System.out.print(String.format("%02d", timeMinute));
 
      System.out.println(" is " + tollAmount);
   }   
}


Enter time of travel (HH:MM in 24 hour format): 10:45
Enter type of day (0 - weekday, 1 - weekend/holiday): 1
Toll at 10:45 is 3.05

participation activity
3.10.2: If-else statements for calculating toll amount and formatting time.
1)
The outer if-else statement checks the type of day, and the nested if-else statements check the hour of travel.
2)
An alternative implementation that checks the hour of travel in outer if-else statements and checks the type of day using nested if-else statements would have the same number of if statements.
3)
If timeHour is 0 and timeMinute is 30, the time will be output as: 0:30.
Calculating toll with carpool discount

A toll road may have a discount for carpools, sometimes called high-occupancy vehicles (HOV). The following program uses if-else statement to adjust the toll amount based on the number of people in the vehicle. The carpool discount rules are:

    A carpool is 3 or more people per vehicle.
    The toll for carpools on weekdays between 6:00 am and 10:00 am is half the normal toll.
    Otherwise, the toll for carpools is 0 (as in free).

Figure 3.10.3: Calculating toll with carpool discount.

import java.util.Scanner;
 
public class TollCalc {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int timeHour;      // Time of travel hour (24 hour format)
      int timeMinute;    // Time of travel minute
      int typeOfDay;     // 0 - weekday, 1 - weekend/holiday
      int numPeople;    // People in vehicle
      int inputColon;    // Used to read time format
      String userInput;  // User specified time
      double tollAmount;
   
      System.out.print("Enter time of travel (HH:MM in 24 hour format): ");
 
      // Read an integer (hour), colon (char), and integer (minute)
      // with built-in string operators (discussed elsewhere)      
      userInput = scnr.nextLine();
      inputColon = userInput.indexOf(":");
      timeHour = Integer.parseInt(userInput.substring(0, inputColon));
      timeMinute = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length()));
 
      System.out.print("Enter type of day (0 - weekday, 1 - weekend/holiday): ");
      typeOfDay = scnr.nextInt();
   
      System.out.print("Enter number of people in vehicle: ");
      numPeople = scnr.nextInt();

      if (typeOfDay == 0) { // Weekday time and rates
                            // Determine toll based on hour of travel
         if (timeHour < 6) {         // Before 6:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 10) {   // 6 am to 9:59 am
            tollAmount = 4.65;
         }
         else if (timeHour < 18) {   // 10 am to 5:59 pm
            tollAmount = 2.35;
         }
         else {                      // 6 pm and after
            tollAmount = 1.55;
         }
      }
      else { // Weekend/holiday time and rates
             // Determine toll based on hour of travel
         if (timeHour < 8) {         // Before 8:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 12) {   // 8 am to 11:59 am
            tollAmount = 3.05;
         }
         else if (timeHour < 16) {   // 12 pm to 3:59 pm
            tollAmount = 3.45;
         }
         else if (timeHour < 19) {   // 4 pm to 6:59 pm
            tollAmount = 3.60;
         }
         else if (timeHour < 22) {   // 7 pm to 9:59 pm
            tollAmount = 3.05;
         }
         else {                      // 10 pm and after
            tollAmount = 1.55;
         }
      }

      // Check for carpool rate (3 or more people) and update toll
      if (numPeople >= 3) {
         // If on a weekday between 6:00 am and 9:59 am, toll is half off
         if ((typeOfDay == 0) && (timeHour >= 6) && (timeHour < 10)) {
            tollAmount = tollAmount * 0.5;
         }
         // Otherwise, the toll is free
         else {
            tollAmount = 0.0;
         }
      }

      // Output toll using am/pm format
      System.out.print("Toll at ");
   
      // Output hour adjusting for am/pm format
      if (timeHour == 0) {
         System.out.print("12:");
      }
      else if (timeHour <= 12) {
         System.out.print(timeHour + ":");
      }
      else {
         System.out.print((timeHour - 12) + ":");
      }
   
      // Output minute with formatting (discussed elsewhere) to
      // print two digits for minutes.
      System.out.print(String.format("%02d", timeMinute));
 
      System.out.println(" is " + tollAmount);
   }   
}


Enter time of travel (HH:MM in 24 hour format): 17:15
Enter type of day (0 - weekday, 1 - weekend/holiday): 0
Enter number of people in vehicle: 3
Toll at 5:15 is 0.0

participation activity
3.10.3: Toll calculation.

Match the final value of tollAmount to the timeHour, typeOfDay, and numPeople.

If unable to drag and drop, refresh the page.

    4.65
    0.0
    2.325
    1.55

timeHour is 7, typeOfDay is 0, numPeople is 1
timeHour is 8, typeOfDay is 0, numPeople is 4
timeHour is 18, typeOfDay is 1, numPeople is 3
timeHour is 20, typeOfDay is 0, numPeople is 2
How was this section?
3.11 Switch statements
