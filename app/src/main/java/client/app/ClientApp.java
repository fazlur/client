package client.app;

import client.domain.Client;
import client.repository.ClientRepository;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ClientApp {

    public static void main(String[] args) {
        JFrame window = new JFrame("Client Application");
        Client model = null;
        ClientRepository repository = null;

        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
