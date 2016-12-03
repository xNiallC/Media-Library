
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable {
	//public variables
	public static Scanner in = new Scanner(System.in);
	public static ArrayList<Film> myfilm = new ArrayList<Film>(10);
	public static ArrayList<Audio_Tracks> myaudio = new ArrayList<Audio_Tracks>();
	public static ArrayList<TV> myTV = new ArrayList<TV>();

	public static void main(String[] args) {

		Film Django = new Film();
	    Django.setMedia("Django_Unchained", "*****", 2012);
	    Django.setFilm("2h45m", "The_Weinstein_Company", "Quentin_Tarantino"); //This is an example of a film object that is in my database.
		myfilm.add(Django);

		Audio_Tracks Waves = new Audio_Tracks();
	    Waves.setMedia("Waves", "****", 2016);
		Waves.setAudio_track("Kanye_West", "0h3m", "GOOD_Music"); //This is an example of an audio track
		myaudio.add(Waves);

		TV Ozymandias = new TV();
		Ozymandias.setMedia("Breaking_Bad", "*****", 2013 );
		Ozymandias.setTV(5, 14,"AMC" , "AMC");
		myTV.add (Ozymandias);


		//Local variables for the main menu
		int menu = 0;

	        do {
			//This is the menu system
			System.out.println("~~~~ Media Library ~~~~");
			System.out.println("");
			System.out.println("1. Add a New Media Item");
			System.out.println("2. Search for & Edit/Delete a Media Item" );
			System.out.println("3. Randomly Select a Media Item");
			System.out.println("4. Exit");
			System.out.println("");
			System.out.println("Enter a menu choice (1-4)");

			menu = in.nextInt();

			switch(menu){

			case 1:

				int new_media_item = 0;
				do{

				System.out.println("Please choose which type of Media Item you'd like to add");
				System.out.println("");
				System.out.println("1. Film");
				System.out.println("2. Audio Track");
				System.out.println("3. TV Programme");
				System.out.println("4. Go back to main menu");
				new_media_item = in.nextInt();

				if (new_media_item == 1){
					createFilm();
				}

				else if (new_media_item == 2){
					createAudio_Track();
					}
				else if (new_media_item ==3){
					createTV();
				}
				 // end of IF statement
				} while(new_media_item >=5 );
			    break;

				case 2:	findMedia();

					break;

				case 3:
					System.out.println(myfilm.size());
					break;

				case 4:
					System.out.println("Would you like to exit? (1 for yes and 2 for no)");
					if (in.nextInt() == 1){
						menu = 9;}
						else{
							menu = 0;
					}

			}//end of the do section of the do loop
			 } while(menu <= 8);

			}

				// end of main
public static void createFilm(){


	Film newfilm = new Film();

	System.out.println("Title");
	String title = in.next();

	System.out.println("Year of Release");
	int year_of_release = in.nextInt();

	System.out.println("Duration (Hours and minutes eg: 2h30m)");
	String duration = in.next();

	System.out.println("Studio");
	String studio = in.next();

	System.out.println("Director");
	String director = in.next();

	System.out.println("Star-Rating /5* (eg **** for 4 stars )");
	String star_rating = in.next();

	newfilm.setMedia(title, star_rating, year_of_release);
	newfilm.setFilm(duration,studio, director);

	myfilm.add(newfilm);
} // end of create Film

public static void createAudio_Track(){
	Audio_Tracks newaudio_track = new Audio_Tracks();

	System.out.println("Title");
	String title = in.next();

	System.out.println("Year of Release");
	int year_of_release = in.nextInt();

	System.out.println("Duration (Hours and minutes eg: 2h30m)");
	String duration = in.next();

	System.out.println("Artist/Band");
	String artist = in.next();

	System.out.println("Record Label");
	String record_label = in.next();

	System.out.println("Star-Rating /5* (eg **** for 4 stars )");
	String star_rating = in.next();

	newaudio_track.setMedia(title, star_rating, year_of_release);
	newaudio_track.setAudio_track(duration, artist, record_label);

	myaudio.add(newaudio_track);
} // end of create audio track

public static void createTV(){
	TV newTV = new TV();

	System.out.println("Title");
	String title = in.next();

	System.out.println("Year of Release");
	int year_of_release = in.nextInt();

	System.out.println("Series");
	int series = in.nextInt();

	System.out.println("Episode");
	int episode = in.nextInt();

	System.out.println("Studio");
	String studio = in.next();

	System.out.println("Channel");
	String channel = in.next();

	System.out.println("Star-Rating /5* (eg **** for 4 stars )");
	String star_rating = in.next();

	newTV.setMedia(title, star_rating, year_of_release);
	newTV.setTV(series,episode, studio, channel);

	myTV.add(newTV);

} //end of create TV Programme


public static void findMedia(){
	int find_menu = 0;
	String title = "";
	do{
	System.out.println("1. Search for Film");
	System.out.println("2. Search for an Audio Track");
	System.out.println("3. Search for a TV Programme");
	System.out.println("4. Go back");
	find_menu = in.nextInt();


	switch(find_menu){

	case 1:

	System.out.println("Enter the Film Title:");
    title = in.next();

for (int i=0; i < myfilm.size(); i++){
	if (myfilm.get(i).getTitle().equals(title)){

		System.out.println( myfilm.get(i).getTitle() + " - " + myfilm.get(i).getYear_of_release() + " - " + myfilm.get(i).getDuration() + " - " + myfilm.get(i).getStudio() + " - " +
		myfilm.get(i).getDirector() + " - " + myfilm.get(i).getStar_rating() + "\n");
	}

		int film_menu = 0;

		do{
			System.out.println("1. Edit " + myfilm.get(i).getTitle());
			System.out.println("2. Delete " +  myfilm.get(i).getTitle() + " from library");
			System.out.println("3. Go Back");
			film_menu = in.nextInt();

			switch(film_menu){

				case 1:
					int film_edit_menu = 0;
					do {

						System.out.println("1. Edit Title\n2. Edit Year of Release\n3. Edit Duration\n4. Edit Studio\n5. Edit Director\n6. Edit Star Rating\n7. Go back");
						film_edit_menu = in.nextInt();

						if(film_edit_menu == 1) {
							System.out.println("Change Title from " + myfilm.get(i).getTitle() );
							myfilm.get(i).setTitle(in.next());
						}

						else if(film_edit_menu == 2) {
							System.out.println("Change Year of Release from " + myfilm.get(i).getYear_of_release() );
							myfilm.get(i).setYear_of_release(in.nextInt());
						}

						else if(film_edit_menu == 3) {
							System.out.println("Change Duration from " + myfilm.get(i).getDuration() );
							myfilm.get(i).setDuration(in.next());
						}

						else if(film_edit_menu == 4) {
							System.out.println("Change Studio from " + myfilm.get(i).getStudio() );
							myfilm.get(i).setStudio(in.next());
						}

						else if(film_edit_menu == 5) {
							System.out.println("Change Director from " + myfilm.get(i).getDirector() );
							myfilm.get(i).setDirector(in.next());
						}

						else if(film_edit_menu == 6) {
							System.out.println("Change Star Rating from " + myfilm.get(i).getStar_rating() );
							myfilm.get(i).setStar_rating(in.next());
						}

					} while (film_edit_menu <= 6);

					break;

				case 2:

					System.out.println("Are you sure you want to delete " + myfilm.get(i).getTitle() + "? (1 for yes, 0 for no");
					if(in.nextInt() == 1){
						myfilm.remove(i);
					}

					break;
			}


		} while (film_menu <=3);
		//else {System.out.println("I hate java");}

			break;

	case 2:

	System.out.println("Enter the Audio Track Title:");
	title = in.next();

	for (int i=0; i < myaudio.size(); i++);{
		if (myaudio.get(i).getTitle().equals(title)){

			System.out.println( myaudio.get(i).getTitle() + " - " + myaudio.get(i).getYear_of_release() + " - " + myaudio.get(i).getDuration() + " - " + myaudio.get(i).getArtist() + " - " +
					myaudio.get(i).getRecord_label() + " - " + myaudio.get(i).getStar_rating() + "\n");
				}

			int audio_menu = 0;
			do{
			System.out.println("1. Edit " + myaudio.get(i).getTitle());
			System.out.println("2. Delete " +  myaudio.get(i).getTitle() + " from library");
			System.out.println("3. Go Back");
			audio_menu = in.nextInt();

			switch(audio_menu){

				case 1:
					int audio_edit_menu = 0;
					do{
					System.out.println("1. Edit Title\n2. Edit Year of Release\n3. Edit Duration\n4. Edit Artist\n5. Edit Record Label\n6. Edit Star Rating\n7. Go back");
					audio_edit_menu = in.nextInt();
					if(audio_edit_menu == 1) {
						System.out.println("Change Title from " + myaudio.get(i).getTitle() );
						myaudio.get(i).setTitle(in.next());}

					else if(audio_edit_menu == 2) {
						System.out.println("Change Year of Release from " + myaudio.get(i).getYear_of_release() );
						myaudio.get(i).setYear_of_release(in.nextInt());}

					else if(audio_edit_menu == 3) {
						System.out.println("Change Duration from " + myaudio.get(i).getDuration() );
						myaudio.get(i).setDuration(in.next());}

					else if(audio_edit_menu == 4) {
						System.out.println("Change Artist from " + myaudio.get(i).getArtist() );
						myaudio.get(i).setArtist(in.next());}

					else if(audio_edit_menu == 5) {
						System.out.println("Change Record Label from " + myaudio.get(i).getRecord_label() );
						myaudio.get(i).setRecord_label(in.next());}

					else if(audio_edit_menu == 6) {
						System.out.println("Change Star Rating from " + myaudio.get(i).getStar_rating() );
						myaudio.get(i).setStar_rating(in.next());}

					} while (audio_edit_menu <= 6);

					break;

					case 2:

						System.out.println("Are you sure you want to delete " + myaudio.get(i).getTitle() + "? (1 for yes, 0 for no");
						if(in.nextInt() == 1) {
							myaudio.remove(i);
						}


					break;

			} while (audio_menu <=2);

			}
		break;

		case 3:
			System.out.println("Enter the TV Programme Title:");
			title = in.next();

			for (int i=0; i >myTV.size(); i++);{
				if (myTV.get(i).getTitle().equals(title)){
					System.out.println( myTV.get(i).getTitle() + " - " + myTV.get(i).getYear_of_release() + " - Series " + myTV.get(i).getSeries() + " - Episode " + myTV.get(i).getEpisode() + " -Channel: " +
							myTV.get(i).getChannel() + " - Studio: " + myTV.get(i).getStudio() + " - " + myTV.get(i).getStar_rating() + "\n");
				}

				int TV_menu = 0;
				do{
				System.out.println("1. Edit " + myTV.get(i).getTitle());
				System.out.println("2. Delete " +  myTV.get(i).getTitle() + " from library");
				System.out.println("3. Go Back");
				TV_menu = in.nextInt();

				switch(TV_menu){

				case 1:
					int film_edit_menu = 0;
					do{
					System.out.println("1. Edit Title\n2. Edit Year of Release\n3. Edit Series\n4. Edit Episode\n5. Edit Studio\n6. Edit Channel\n7. Edit Star Rating\n8. Go back");
					film_edit_menu = in.nextInt();
					if(film_edit_menu == 1) {
						System.out.println("Change Title from " + myTV.get(i).getTitle() );
						myTV.get(i).setTitle(in.next());}

					else if(film_edit_menu == 2) {
						System.out.println("Change Year of Release from " + myTV.get(i).getYear_of_release() );
						myTV.get(i).setYear_of_release(in.nextInt());}

					else if(film_edit_menu == 3) {
						System.out.println("Change Series from " + myTV.get(i).getSeries() );
						myTV.get(i).setSeries(in.nextInt());}

					else if(film_edit_menu == 4) {
						System.out.println("Change Episode from " + myTV.get(i).getEpisode() );
						myTV.get(i).setEpisode(in.nextInt());}

					else if(film_edit_menu == 5) {
						System.out.println("Change Studio from " + myTV.get(i).getStudio() );
						myTV.get(i).setStudio(in.next());}

					else if(film_edit_menu == 6) {
						System.out.println("Change Channel from " + myTV.get(i).getChannel() );
						myTV.get(i).setChannel(in.next());}

					else if(film_edit_menu == 7) {
						System.out.println("Change Star Rating from " + myTV.get(i).getStar_rating() );
						myTV.get(i).setStar_rating(in.next());}

					} while (film_edit_menu <= 7);

					break;

				case 2:

					System.out.println("Are you sure you want to delete " + myTV.get(i).getTitle() + "? (1 for yes, 0 for no");
					if(in.nextInt() == 1){myTV.remove(i);}
				}

				break;

				}while (TV_menu <=2);

			}break;
  }
   }while(find_menu >= 5);
    }
     }


//End
