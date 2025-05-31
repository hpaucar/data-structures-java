import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlaylistGUI extends JFrame {
    private CircularList playlist;
    private JLabel songLabel;
    private JButton nextButton;

    public PlaylistGUI() {
        setTitle("🎬 Circular Playlist");
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        playlist = new CircularList();
        loadSongs();

        songLabel = new JLabel("Current song: " + playlist.getCurrentSong(), JLabel.CENTER);
        songLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        nextButton = new JButton("▶ Next");

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO
                String name = playlist.nextSong();
                songLabel.setText("Current song: " + name);
            }
        });

        add(songLabel, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadSongs() {
        playlist.add("🎵 Yesterday");
        playlist.add("🎵 Imagine");
        playlist.add("🎵 Let It Be");
        playlist.add("🎵 Bohemian Rhapsody");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlaylistGUI());
    }
}