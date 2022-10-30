import java.util.Scanner;

public class quizOne {
	public static void main(String[] args) {
		
		Double numberSeasons;
		Double numberEpisodes;
		Double averageLength;
		Double numberWatched;
		Double totalHours;
		Double totalHoursWatched;
		Double totalHoursLeft;
		
		Scanner scnr = new Scanner(System.in) ; 
        Scanner stringScanner = new Scanner(System.in);
		
		System.out.println("What is your favorite show? ");
		String favoriteShow = stringScanner.next();
		
		System.out.println("How many seasons have there been? ");
		numberSeasons = scnr.nextDouble();
		
		System.out.println("How many episodes to they have per season? ");
		numberEpisodes = scnr.nextDouble();
		
		System.out.println("Average length per episode in minutes? ");
		averageLength = scnr.nextDouble() / 60 ;
		
		System.out.println("How many episodes have you watched? ");
		numberWatched = scnr.nextDouble();
		
		totalHours = ((numberSeasons * numberEpisodes) * averageLength) ;
		totalHoursWatched = (averageLength * numberWatched) ;
		totalHoursLeft = totalHours - totalHoursWatched ;
		
		System.out.println("You have watched " + totalHoursWatched + " hours out of " + totalHours + " hours of " + favoriteShow + "!!");
		System.out.println("You have to watch " + totalHoursLeft + " hours of " + favoriteShow + " to complete the entire series!!");
	}
}
		