
public class Media {
	// Attributes for all media 
	private String title = ""; 
	private int year_of_release = 0000; 
	private String star_rating = ""; 
	
	//methods 
	public void setMedia(String title, String star_rating, int year_of_release){ 
		
		this.title= title; 
		this.year_of_release = year_of_release;
		this.star_rating = star_rating; 
	}
	
	public String getTitle(){
		return title;
	}// getTitle
	
	public String getStar_rating(){
		return star_rating;
	}// getStar_rating 
	
	public int getYear_of_release(){
		return year_of_release;
	}//getYear_of_release

public String setTitle(String title){
	return this.title = title;}
	
public int setYear_of_release(int year_of_release){
		return this.year_of_release = year_of_release;}

public String setStar_rating(String star_rating){
	return this.star_rating = star_rating;
}
}// Media Class
