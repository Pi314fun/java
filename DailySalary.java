import java.util.Scanner;

public class DailySalary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int salaryPerYear; // User input: Yearly salary
      int daysPerYear;   // User input: Days worked per year
      int salaryPerDay;  // Output:     Salary per day

      System.out.print("Enter yearly salary: ");
      salaryPerYear = scnr.nextInt();
      
      System.out.print("Enter days worked per year: ");
      daysPerYear = scnr.nextInt();

      // If daysPerYear is 0, then divide-by-zero causes program termination.
      salaryPerDay = salaryPerYear / daysPerYear;

      System.out.println("Salary per day is: " + salaryPerDay);
   }
}