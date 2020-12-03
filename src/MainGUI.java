import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MainGUI extends JFrame implements ActionListener {


    private JMenu playlistMenu;
    private JMenu songMenu;
    private JLabel response;

    private ArrayList<Playlist> allPlayLists; //added by JB - an array-list to hold all the play-lists created
    private ArrayList<Song> allSongs; //added by JB - an array-list to hold all the songs created

    //JB suggestion - for now you can populate the array-lists above with some hard-coded values for the Song and
    //PlayList objects (check out lab-sheet 11 on array-lists)

    /**
     *
     */
    public MainGUI(){
        super("PlaylistApp");

        setLayout(new GridBagLayout());

        createPlaylistMenu();
        createSongMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(playlistMenu);
        menuBar.add(songMenu);

        response = new JLabel("PlaylistApp");
        add(response);

        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(250,200);
        setVisible(true);


    }

    /**
     * @param args
     */
    //added by JB - main() to run the application
    public static void main(String[] args) {
        new MainGUI();
    }


    /**
     *
     */
    private void createPlaylistMenu(){

        JMenuItem item;

        playlistMenu = new JMenu("Playlist");

        item = new JMenuItem("New");
        item.addActionListener(this);
        playlistMenu.add(item);

        //JB - suggest you have a "Find" menu-item that will allow the user to find a particular play-list so that you can then
        item = new JMenuItem("Find");
        item.addActionListener(this);
        playlistMenu.add(item);

        item = new JMenuItem("Remove");
        item.addActionListener(this);
        playlistMenu.add(item);
    }


    /**
     *
     */
    private void createSongMenu() {
        //JB - see if you can create this menu and its menu-items

        JMenuItem item;

        songMenu = new JMenu("Song");

        item = new JMenuItem("Add Song");
        item.addActionListener(this);
        songMenu.add(item);

        //JB - suggest you add an "Amend" option too just in case you want to alter the details of a particular Song object
        item = new JMenuItem("Amend");
        item.addActionListener(this);
        songMenu.add(item);

        item = new JMenuItem("Remove Song");
        item.addActionListener(this);
        songMenu.add(item);

    }

    /**
     *
     */
    public static void createPlaylist() {
        String name = "";

        JOptionPane.showInputDialog("Name your new playlist: " + name);
    }

    /**
     * @param event
     */
    public void actionPerformed(ActionEvent event) {
        String menuName;
        menuName = event.getActionCommand();

        if (menuName.equals("Quit"))
            System.exit(0);
        else
            response.setText("Menu Item " + menuName + "is selected");

    }
}
