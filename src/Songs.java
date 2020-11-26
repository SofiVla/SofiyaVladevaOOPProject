import javax.swing.*;

public class Songs {

    private String artistName;
    private String song;


    Songs(String artistName, String song) {
        setArtistName(artistName);
        setSong(song);
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSong() {
        return song;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String toString() {
        return "Artist Name: " + getArtistName() + " Song: " + getSong() + "\n";
    }
}

   /* public void moreSongs() {

        String songs = "";
        String artistName = "";

        for(int i=0; i<=20; i++) {

            JOptionPane.showInputDialog("Please enter the song you would like to add to your playlist: " + songs);
            JOptionPane.showInputDialog("Please enter the artist name: " + artistName);
        }

    }
}*/