
import java.util.Scanner;

private class average {
    public static void main(string[] args){
        Scanner scnr = new Scanner(System.in);
        int averageTotal;
        int value1;
        int value2;
        int value3;
        System.out.print("Enter first value (0-100): "); // input prompt
        value1 = scnr.nextInt();
        System.out.print("Enter first value (0-100): "); // input prompt
        value2 = scnr.nextInt();
        System.out.print("Enter first value (0-100): "); // input prompt
        value3 = scnr.nextInt();
        averageTotal = (value1 + value2 + value3) / 3;
        System.out.println("The average is: " + averageTotal);

      
      
        


    }
    
}
