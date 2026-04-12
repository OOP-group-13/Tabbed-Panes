package TabbedPackage;

import javax.swing.*;
import java.awt.*;

public class TabFactory {
    public static JPanel createDashboard() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Overview", SwingConstants.CENTER), BorderLayout.NORTH);
        panel.add(new JTextArea("Hello World..."), BorderLayout.CENTER);
        panel.setBackground(new Color(245, 245, 245));
        return panel;
    }

    public static JPanel createInputForm() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(new JLabel("Username:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());
        panel.add(new JButton("Submit"));
        return panel;
    }

    public static JPanel createDataLog() {
        String[] columns = {"ID", "Event", "Timestamp"};
        Object[][] data = {{1, "Login", "10:00"}, {2, "Update", "10:15"}};
        return new JPanel(new BorderLayout()) {{
            add(new JScrollPane(new JTable(data, columns)));
        }};
    }

    public static JPanel createSettings() {
        JPanel panel = new JPanel();
        panel.add(new JCheckBox("Enable Notifications"));
        panel.add(new JCheckBox("Dark Mode"));
        panel.add(new JSlider(JSlider.HORIZONTAL, 0, 100, 50));
        return panel;
    }

    public static JPanel createAboutSection() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("<html><div style='text-align: center;'><h2>Version 1.0</h2><p>Built with Java Swing</p></div></html>"));
        return panel;
    }
}
