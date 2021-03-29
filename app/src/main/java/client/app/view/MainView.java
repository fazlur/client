package client.app.view;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class MainView extends JFrame {

    private JMenuBar menuBar;
    private JPanel panel;
    private JPanel statusPanel;

    private JMenu fileMenu;
    private JMenu signUpMenu;

    private JMenuItem exitMenuItem;
    private JMenuItem clientMenuItem;

    public MainView() {
        super("Client Application");

        initComponents();
        initControllers();
        initView();

        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        signUpMenu = new JMenu("Sign Up");
        exitMenuItem = new JMenuItem("Exit");
        clientMenuItem = new JMenuItem("Client");
        panel = new JPanel(new BorderLayout());
        statusPanel = new JPanel();
    }

    private void initControllers() {
        exitMenuItem.addActionListener(e -> {
            final int action = showConfirmDialog(this, "Bye bye?", "Exit", YES_NO_OPTION);
            switch (action) {
                case NO_OPTION:
                    break;
                case YES_OPTION:
                    dispose();
                    break;
            }
        });
    }

    private void initView() {
        initMenu();
        panel.add(new ClientListView(), BorderLayout.CENTER);
        initStatusPanel();

        setJMenuBar(menuBar);
        add(panel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.PAGE_END);
    }

    private void initStatusPanel() {
        statusPanel.setBackground(Color.darkGray);
        statusPanel.add(new JLabel("OK"));
    }

    private void initMenu() {
        menuBar.add(fileMenu);
        menuBar.add(signUpMenu);

        fileMenu.add(exitMenuItem);

        signUpMenu.add(clientMenuItem);
    }
}
