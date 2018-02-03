import java.util.Scanner;
import java.util.Random;

public class Driver {

	static Scanner s = new Scanner(System.in);
	static Random r = new Random();

	
	public static void main(String[] args) {
		
		//initializes movies and 2d array
		
		Movie kingKong=new Movie("King Kong", 'a');
		Movie theNotebook=new Movie("The Notebook", 'd');
		Movie sideways=new Movie("Sideways", 'd');
		Movie theMask=new Movie("The Mask", 'c');
		Movie inception=new Movie("Inception", 't');
			
		String[][] theatre = new String[5][10];
		Movie[] movies = {kingKong, theNotebook, sideways, theMask, inception};
		
		//-------------------------------------------
		
		////sets up left side of theatre as movie names
		
		for(int i=0;i<theatre.length;i++){ 
			theatre[i][0]=movies[i].toString();
		}
		
		/*for(int i=0;i<theatre.length;i++){
			for(int j =18; j>=theatre[i][0].length();j--){
				theatre[i][0] = theatre[i][0]+ " ";
			}
		}*/ //probably not needed, meant to set all the cells on the lefthand side to the same length
		
		//---------------------------------------------------------------------------
		
		Viewer v = new Viewer();
		
		int movieChoice;
		int ratingChoice;
		
		System.out.println("Welcome reviewer, what is your name? ");
		v.setName(s.nextLine());
		
		do{
			System.out.println(v.getName()+", Type the number for the movie you'd like to rate: ");
			System.out.println("\t1) " + theatre[0][0]);
			System.out.println("\t2) " + theatre[1][0]);
			System.out.println("\t3) " + theatre[2][0]);
			System.out.println("\t4) " + theatre[3][0]);
			System.out.println("\t5) " + theatre[4][0]);
			
			movieChoice = s.nextInt();
			
		} while(movieChoice > 6 || movieChoice < 0);
		
		do{
			System.out.println("What would you like to rate " + theatre[movieChoice-1][0] + "? Enter a number from 0-100: ");
			
			ratingChoice = s.nextInt();
		
		} while(ratingChoice > 100 || ratingChoice < 0);
		
		System.out.println("You rated "+theatre[movieChoice][0] + " " + ratingChoice + "/100.");
		
	
		
		
		
		
		
		
		
		
		
	
		
			
		
			
		
	
		
	}

}
