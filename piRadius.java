import java.util.Scanner;

public class piRadius {
   /**
 * @param args
 */
public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); //setup input
    
      double areaOfCircle; //declared variable
      System.out.print("Enter radius: "); // input prompt
      float radius1 = scnr.nextInt(); // declared varible and assigned value
    
      areaOfCircle = 3.14 * (radius1 * radius1); //order of operations doesnt matter with multiplying

      System.out.println(" The area of the circle is: " + areaOfCircle);// print out area of circle
   }
}


