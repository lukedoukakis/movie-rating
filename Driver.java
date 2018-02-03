import java.util.Scanner;
import Random;

public class Driver {

	Scanner s = new Scanner(System.in);
	Random r = new Random();

	public int generateRandom(){
		int n = r.nextInt(5);
	}

	
	public static void main(String[] args) {
		Movie kingKong=new Movie("King Kong", 'a');
		Movie theNotebook=new Movie("The Notebook", 'd');
		Movie sideways=new Movie("Sideways", 'd');
		Movie theMask=new Movie("The Mask", 'c');
		Movie inception=new Movie("Inception", 't');
			
		String[][] theatre = new String[5][10];
		Movie[] movies = {kingKong, theNotebook, sideways, theMask, inception}
		
		
		for(int i=0;i<theatre.length;i++){
			theatre[i]=movies[i];
		}
		
		System.out.println
		
			
		
			
		
	
		
	}

}
