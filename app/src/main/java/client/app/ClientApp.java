package client.app;

import client.domain.Client;
import client.domain.model.DefaultClient;
import client.repository.ClientRepository;

import javax.swing.*;

public class ClientApp {

    public static void main(String[] args) {
        // Troca de mensagem (uso de objetos)
        JFrame window = new JFrame("Client Application");
        Client model = new DefaultClient("Edson", "Prestes"); // Composição
        ClientRepository repository = null;

        model.addEMail(JOptionPane.showInputDialog("Please, inform your email."));
        model.addCellPhone("012359841");
        System.out.println(model);

        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // window.setVisible(true);
    }
}
