import java.util.Scanner;
import java.util.Random;

public class Driver {

	static Scanner s = new Scanner(System.in);
	static Random r = new Random();

	
	public static void main(String[] args) {

		System.out.println("Welcome to MovieRate!");
		System.out.println("Press 1 to create a new user or press 2 to exit: ");
		int firstChoice = s.nextInt();

		while (firstChoice != 1 || firstChoice !=2)
		{
			System.out.println("Invalid input. Try again: ");
			firstChoice = s.nextInt();
		}

		if (firstChoice==1)
			viewer();
		else
			System.exit(0);
	}
	public static void viewer()
	{
		int viewerCount = 0;
		viewerCount++;
		Viewer v = new Viewer();


		System.out.println("Welcome reviewer, what is your name? ");
		v.setName(s.nextLine());

		choice(v, viewerCount);

	}

	public static void choice(viewer vwr, int ch)
	{
		//initializes movies and 2d array
		
		Movie kingKong=new Movie("King Kong", 'T');
		Movie moana=new Movie("Moana", 'E');
		Movie sideways=new Movie("Sideways", 'R');
		Movie theMask=new Movie("The Mask", 'T');
		Movie deadpool =new Movie("Deadpool", 'R');
			
		String[][] theatre = new String[5][10];
		Movie[] movies = {kingKong, moana, sideways, theMask, deadpool};
		
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

		do
		{
			System.out.println("Press 1 to review a movie, 2 to display all reviews, 3 to create a new user,"
				   	   + " and 4 to exit: ");
			int path = s.nextInt();
		} while (path > 5 || path < 1);

		if(path==1)
			movieRate(theatre, vwr, ch);
		else if(path==2)
			displayAll(theatre, ch);
		else if(path==3)
			viewer();
		else
			System.exit(0);
		

	}
	public static void movieRate(String[][] mv, viewer vw, int vwCount)
	{
		int movieChoice;
		int ratingChoice;

		do{
			System.out.println(v.getName()+", Type the number for the movie you'd like to rate: ");
			System.out.println("\t1) " + mv[0][0]);
			System.out.println("\t2) " + mv[1][0]);
			System.out.println("\t3) " + mv[2][0]);
			System.out.println("\t4) " + mv[3][0]);
			System.out.println("\t5) " + mv[4][0]);
			
			movieChoice = s.nextInt();
			
		} while(movieChoice > 6 || movieChoice < 0);

	
		
		
		do{
			System.out.println("What would you like to rate " + mv[movieChoice-1][0] + "? Enter a number from 0-100: ");
			
			ratingChoice = s.nextInt();
		
		} while(ratingChoice > 100 || ratingChoice < 0);
		
		System.out.println("You rated "+mv[movieChoice][0] + " " + ratingChoice + "/100.");

		String arrayColmn = vw.getName() + ": " + ratingChoice;

		mv[movieChoice-1][vwCount] = arrayColmn;

	}
	
	public static void displayAll(String[][]finalArray, int col)
	{
		int rows = 5;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(finalArray[i][0]);
			for(int j=1; j <=col; j++)
			{
				System.out.println(finalArray[i][j]);
			}		
		}
		
	}
}
