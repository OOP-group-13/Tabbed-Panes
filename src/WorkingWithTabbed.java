import TabbedPackage.TabFactory;

import javax.swing.*;
import java.awt.*;

public class WorkingWithTabbed extends JFrame {
    public WorkingWithTabbed() {
        setTitle("Multi-Section Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setJMenuBar(createTopMenu());

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Dashboard", new ImageIcon(), TabFactory.createDashboard(), "View Summary");
        tabbedPane.addTab("Registration", new ImageIcon(), TabFactory.createInputForm(), "Enter User Data");
        tabbedPane.addTab("Records", new ImageIcon(), TabFactory.createDataLog(), "View History");
        tabbedPane.addTab("Preferences", new ImageIcon(), TabFactory.createSettings(), "Adjust Settings");
        tabbedPane.addTab("Help", new ImageIcon(), TabFactory.createAboutSection(), "App Information");

        add(tabbedPane);
    }

    private JMenuBar createTopMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        return menuBar;
    }

}
