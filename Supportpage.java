import javax.swing.*;

public class SupportPage extends JFrame {
    public SupportPage() {
        super("Support Page");
        setSize(500, 500); // set size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation
        setLocationRelativeTo(null); // center the window
        setResizable(false); // prevent resizing of the window

        // Create a JPanel to list options for one-time & monthly support
        JPanel supportPanel = new JPanel();

        // Add options for one-time & monthly support to the support panel
        // ...

        // Create a JPanel to provide upgrade details
        JPanel upgradePanel = new JPanel();

        // Add upgrade details to the upgrade panel
        // ...

        // Add the support panel and upgrade panel to the support page
        // ...
    }
}