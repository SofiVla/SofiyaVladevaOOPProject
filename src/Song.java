import javax.swing.*;

public class Song{

    private String artistName;
    private String title;
    //JB - see if you can add a few more attributes here that might allow some extra functionality to be introduced
    //For example, if you add a releaseYear attribute then you could do a search on all the songs to get a list of
    //any that were in the 1990s, to create a "90s playlist"


    Song(String artistName, String title) {
        setArtistName(artistName);
        setSong(title);
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSong() {
        return title;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setSong(String song) {
        this.title = song;
    }

    public String toString() {
        return "Artist Name: " + getArtistName() + " Song: " + getSong() + "\n";
    }


    /*public void moreSongs() {

        String songs = "";
        String artistName = "";

        for(int i=0; i<=20; i++) {

            JOptionPane.showInputDialog("Please enter the song you would like to add to your playlist: " + songs);
            JOptionPane.showInputDialog("Please enter the artist name: " + artistName);
        }

    }*/
}