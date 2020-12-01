import java.util.ArrayList;
import java.util.ArrayList;

public class Playlist {

    private String name; //added by JB - the name that identifies this playlist
    private ArrayList<Song> songs; //added by JB - the songs that will make up this playlist
    private int playListID; //added by JB - each playlist will have a unique ID (automatically generated)

    //feel free to add other attributes here that you think could be relevant


    //I'll let you generate the multi-arg constructor
    //along with the accessors and mutators (note that playListID is meant to be auto-generated)
    //also generate a toString() to display the state of a playlist and allow you to test out
    //the functionality of the PlayList class
    //check out lab-sheets 3/4/5 for further information


    //added by JB - add a song to this playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    //added by JB - remove a song from this playlist
    public void removeSong(Song song) {
        for(int i=0; i< songs.size(); i++)
            if(songs.get(i) == song)
                songs.remove(song);
    }

}