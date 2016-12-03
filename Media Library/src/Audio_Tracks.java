class Audio_Tracks extends Media { 
	
	//attributes 
	
	private String artist = ""; 
	private String duration = "";
	private String record_label=""; 
	
	//methods 
	
	public void setAudio_track( String artist, String duration, String record_label){ 
		this.artist = artist; 
		this.duration = duration; 
		this.record_label = record_label;
				
	}
	
	public String getArtist(){
		return artist;
	}

	public String getDuration(){ 
		return duration;
	}
	
	public String getRecord_label(){
		return record_label;}
	
	public String setArtist(String artist){
		return this.artist = artist;}
	
	public String setDuration(String duration){
		return this.duration = duration;}
	
	public String setRecord_label(String record_label){
		return this.record_label = record_label;}
}
