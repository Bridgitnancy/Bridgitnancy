import javax.swing.*;

public class HomePage extends JFrame {
    public HomePage() {
        super("Data Management Application");
        setSize(500, 500); // set size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation
        setLocationRelativeTo(null); // center the window
        setResizable(false); // prevent resizing of the window

        // Create a JPanel to hold different request types and endpoints
        JPanel requestPanel = new JPanel();

        // Add different request types and endpoints to the request panel
        // ...

        // Create a JPanel to display sample request and response details
        JPanel samplePanel = new JPanel();

        // Add sample request and response details to the sample panel
        // ...

        // Create a button to navigate to the support page
        JButton supportButton = new JButton("Support");

        // Add the request panel, sample panel, and support button to the home page
        // ...
    }
}