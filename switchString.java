import  java.util.Scanner;

public class switchString {

public static void main(String [] args) {
    Scanner scnr = new Scanner(System.in);
    
    String memberInput = " ";
    Double memberCat = 0.0;
    System.out.println("Input your membership catagory ");
    System.out.println("(i.e., Velociraptor, Stegosaurus, Triceratops, T-Rex, Brachiosaurus)");
        memberInput = scnr.next() ; 
 
        // Switch statement over above string
        switch (memberInput) {
 
        // Case 1
        case "Velociraptor":
            memberCat = .05 ;
 
            break;
 
        // Case 2
        case "Stegosaurus":
            memberCat = .10 ;

            break;
 
        // Case 3
        case "Triceratops":
             memberCat = .15 ;

            break;
 
        // Case 4
        case "T-Rex":
            memberCat = .30 ;

            break;
 
        // Case 5
        case "Brachiosaurus":
            memberCat = .50 ;

            break;
 
        default:
 
            System.out.println("no match");
        }
    System.out.println("Your discount is " + memberCat);
    }
}
