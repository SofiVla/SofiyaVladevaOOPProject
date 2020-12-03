import java.util.ArrayList;

/**
 *
 */
public class Playlist {

    private String name; //added by JB - the name that identifies this playlist
    private ArrayList<Song> songs; //added by JB - the songs that will make up this playlist
    private int playListID; //added by JB - each playlist will have a unique ID (automatically generated)

    //feel free to add other attributes here that you think could be relevant
    //I'll let you generate the multi-arg constructor

    Song s1 = new Song("MGK", "Forget Me Too", 2020);
    Song s2 = new Song("Aries", "Racecar", 2018);
    Song s3 = new Song("Deep Purple", "Sometimes I Feel Like Screaming", 1996);

    /**
     * @param name
     * @param songs
     * @param playListID
     */
    public Playlist(String name, ArrayList<Song> songs, int playListID) {
        setName(name);
        setSongs(songs);
        setPlayListID(playListID);
    }

    public Playlist() {
    }

    /**
     * @return
     */
    //along with the accessors and mutators (note that playListID is meant to be auto-generated)
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * @return
     */
    public int getPlayListID() {
        return playListID;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param songs
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * @param playListID
     */
    public void setPlayListID(int playListID) {
        this.playListID = playListID;
    }

    //also generate a toString() to display the state of a playlist and allow you to test out

    @Override
    public String toString() {
        return "Name: " + getName() + " Songs: " + getSongs() + " PlaylistID: " + getPlayListID();
    }

    //the functionality of the PlayList class
    //check out lab-sheets 3/4/5 for further information


    /**
     * @param song
     */
    //added by JB - add a song to this playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * @param song
     */
    //added by JB - remove a song from this playlist
    public void removeSong(Song song) {
        for (int i = 0; i < songs.size(); i++)
            if (songs.get(i) == song)
                songs.remove(song);
    }

}