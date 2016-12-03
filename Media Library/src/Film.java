class Film extends Media {
	
	//attributes 
	
	private String duration = ""; 
	private String studio = "";
	private String director = "";
	
	//methods 
	public void setFilm(String duration, String studio, String director){
		this.duration = duration;
		this.studio = studio;
		this.director = director;
	}
	
	public String getDuration(){ 
		return duration;
	}
	
	public String getStudio(){
		return studio;
	}
	
	public String getDirector(){
		return director;
	}
	public String setDuration(String duration){
		return this.duration = duration;}
	
	public String setStudio(String studio){
		return this.studio = studio;}
	
	public String setDirector(String director){
		return this.director = director;}
}
