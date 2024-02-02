import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class Server {

    // global static variable to hold the files the user wants to send over
    static ArrayList<MyFile> myFiles = new ArrayList<>();

    public static void main(String args[]){

        int fileId = 0;

        // Creating the gui
        JFrame jFrame = new JFrame("Server");
        jFrame.setSize(400, 400 );
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        // Creating the scroll bar
        JScrollPane jScrollPane = new JScrollPane(jPanel);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Creating the title
        JLabel jLTitle = new JLabel("File Receiver");
        jLTitle.setFont(new Font("Arial", Font.BOLD, 25));
        jLTitle.setBorder(new EmptyBorder(20, 0, 10, 0));
        jLTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adding these components to the frame
        jFrame.add(jLTitle);
        jFrame.add(jScrollPane);
        jFrame.setVisible(true);

        // Creating the server socket



    }
}
