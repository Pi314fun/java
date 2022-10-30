import java.util.Scanner;

public class controlStructures {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      
      Double userGrade; //users grade
      Boolean attendFinal = true; // attend final bool
      String letterGrade = "" ; // var for letter grade valur
      
      System.out.println("Did they attend the final: true or false ");
      attendFinal = scnr.nextBoolean();
      
      if (attendFinal == false) {
    	  letterGrade = "F" ;
      }
      	else if (attendFinal == true) {
      		System.out.print("What was the grade: "); //imputing user grade
      		userGrade = scnr.nextDouble();
      		
      	//if final was attended this figures out the letter grade and assigns it to letterGrade
      		if (userGrade >= 90) {
      			letterGrade = "A" ;
      		} 
      		else if (userGrade >= 80) {
      			letterGrade = "B" ;
      		}
      		else if (userGrade >= 70) {
      			letterGrade = "C" ;
      		}
      		else if (userGrade >= 60) {
      			letterGrade = "D" ;
      		}      
      		else if (userGrade < 60) {
      			letterGrade = "F" ;
      		}
      	}
      System.out.println("Your letter Grade is " + letterGrade);      
   }
}  

