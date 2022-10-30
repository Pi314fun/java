import java.util.Scanner;
import java.util.Random;
public class choreChart {
   public static void main(String [] args) {
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    Integer x = 0 ;
    Integer peopleIn = 0;
    System.out.println("Hello welcome to the chore selector .. Enter the number of people living in the house");
    peopleIn = scnr.nextInt();
    peopleIn = randGen.nextInt(peopleIn) + 1;
    x = randGen.nextInt(peopleIn) + 1;
    
    if (x == 1) {
        System.out.println("Alright! today it is the turn of Person " + peopleIn + " to do the dishes!");
    }
    else if(x == 2) {
        System.out.println("Alright! today it is the turn of Person " + peopleIn + " to vacuum!");
    }
    else if(x == 3) {
        System.out.println("Alright! today it is the turn of Person " + peopleIn + " to dust ledges!");
    }
    else {
        System.out.println("Alright! today it is the turn of Person " + peopleIn + " to help!");
    }

}
}





    