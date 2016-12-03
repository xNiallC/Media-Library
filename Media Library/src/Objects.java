public class Objects {
public static void main(String[] args) { 
		
		Film Django = new Film();
	    Django.setMedia("Django Unchained", "*****", 2012); 
	    Django.setFilm("2h45m", "The Weinstein Company", "Quentin Tarantino"); //This is an example of a film object that is in my database.
				
		Audio_Tracks Waves = new Audio_Tracks();
	    Waves.setMedia("Waves", "****", 2016);
		Waves.setAudio_track("Kanye West", "0h3m", "GOOD Music"); //This is an example of an audio track
				
		TV Ozymandias = new TV();
		Ozymandias.setMedia("Breaking Bad", "*****", 2013 );
		Ozymandias.setTV(5, 14,"AMC" , "AMC");
		
}
}