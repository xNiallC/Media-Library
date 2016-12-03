class TV extends Media {
	
	//attributes 
	
	private int series = 0; 
	private int episode = 0; 
	private String studio = ""; 
	private String channel = ""; 
	
	//methods 
	public void setTV(int series, int episode, String studio, String channel){ 
		this.series = series;
		this.episode = episode; 
		this.studio = studio; 
		this.channel = channel;
	}
	
	public int getSeries(){
		return series;}
	
	public int getEpisode(){ 
		return episode;}
	
	public String getStudio(){ 
		return studio;}
	
	public String getChannel(){ 
		return channel;}

	public int setSeries(int series){
		return this.series = series;}
	
	public int setEpisode(int episode){
		return this.episode = episode;}
	
	public String setStudio(String studio){
		return this.studio = studio;}
	
	public String setChannel(String channel){
		return this.channel = channel;}
	

}
