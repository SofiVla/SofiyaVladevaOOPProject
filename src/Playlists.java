import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.gray;

class JMenuFrame extends JFrame implements ActionListener{

    JMenu playlistMenu;
    JMenu editMenu;
    JLabel response;

    public JMenuFrame(){
        super("PlaylistApp");

        setLayout(new GridBagLayout());

        createPlaylistMenu();
        createEditMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(playlistMenu);
        menuBar.add(editMenu);

        response = new JLabel("PlaylistApp");
        add(response);

        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(250,200);
        setVisible(true);


}

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class Playlists {

        public void actionPerformed(ActionEvent event){
        String menuName;
        menuName = event.getActionCommand();

        if(menuName.equals("Quit"))
            System.exit(0);
        else
            response.setText("Menu Item " + menuName + "is selected");
    }
}
    private void createPlaylistMenu(){
        JMenuItem item;

        playlistMenu = new JMenu("Create Playlist");

        item = new JMenuItem("New");
        item.addActionListener(this);
        playlistMenu.add(item);

        item = new JMenuItem("Save");
        item.addActionListener(this);
        playlistMenu.add(item);

        item = new JMenuItem("Delete Playlist");
        item.addActionListener(this);
        playlistMenu.add(item);
    }

    private void createEditMenu() {
        JMenuItem item;

        editMenu = new JMenu("Edit Playlist");

        item = new JMenuItem("Add Song");
        item.addActionListener(this);
        playlistMenu.add(item);

        item = new JMenuItem("Remove Song");
        item.addActionListener(this);
        playlistMenu.add(item);
    }


    /*public static void createPlaylist(){
        String name="";
        String song="";



    }*/
}
