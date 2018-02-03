
public class Viewer {
	
	private String name;
	

	//constructor
	public Viewer(String nm)
	{
		name = nm;
	}
	
	//copy constructor
	public Viewer (Viewer object2)
	{
		name = object2.name;
	}

	
	//------getters and setters
	
	public String getName(){
		return name;
	}
	
	public void setName(String nm){
		nm=name;
	}
	
	//--------------------------
	
	public int rateMovie(Movie movie, int rating){  //this will work with your movie class
		return rating;
	}
}
