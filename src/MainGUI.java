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

    //added by JB - main() to run the application
    public static void main(String[] args) {
        new MainGUI();
    }


    private void createPlaylistMenu(){
        JMenuItem item;

        playlistMenu = new JMenu("Playlist");

        item = new JMenuItem("New");
        item.addActionListener(this);
        playlistMenu.add(item);

        //JB - advise that this won't appear in the menu-items but instead the array-lists of Song and PlayList objects will be saved when
        //the application is about to exit

        /*item = new JMenuItem("Save");
        item.addActionListener(this);
        playlistMenu.add(item);*/

        //JB - suggest you have a "Find" menu-item that will allow the user to find a particular play-list so that you can then
        //add a Song object or remove a Song object from the playlist or view the state of the plat-list (or even remove the play-list itself)
        //These options might appear as four individual buttons on a separate GUI

        item = new JMenuItem("Remove"); //JB advice - if this is chosen you then want to "find" which playlist is to be removed (so maybe you don't really need this menu-item)
        item.addActionListener(this);
        playlistMenu.add(item);
    }

    /*private void createEditMenu() {
        JMenuItem item;

        editMenu = new JMenu("Song");

        item = new JMenuItem("Add Song");
        item.addActionListener(this);
        playlistMenu.add(item);

        //JB - suggest you add an "Amend" option too just in case you want to alter the details of a particular Song object

        item = new JMenuItem("Remove Song");
        item.addActionListener(this);
        playlistMenu.add(item);
    }*/

    private void createSongMenu() {
        //JB - see if you can create this menu and its menu-items

        JMenuItem item;

        songMenu = new JMenu("Song");

        item = new JMenuItem("Add Song");
        item.addActionListener(this);
        songMenu.add(item);

        //JB - suggest you add an "Amend" option too just in case you want to alter the details of a particular Song object

        item = new JMenuItem("Remove Song");
        item.addActionListener(this);
        songMenu.add(item);

    }



    public static void createPlaylist() {
        String name = "";

        JOptionPane.showInputDialog("Name your new playlist: " + name);
    }

    public void actionPerformed(ActionEvent event) {
        String menuName;
        menuName = event.getActionCommand();

        if (menuName.equals("Quit"))
            System.exit(0);
        else
            response.setText("Menu Item " + menuName + "is selected");

    }
}
