package client.app;

import client.domain.Client;
import client.domain.model.DefaultClient;
import client.repository.ClientRepository;

import javax.swing.*;

public class ClientApp {

    public static void main(String[] args) {
        // Troca de mensagem (uso de objetos)
        JFrame window = new JFrame("Client Application");
        JPanel thePanel = new JPanel();
        Client model = new DefaultClient("Edson", "Prestes"); // Composição
        ClientRepository repository = null;

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(65, 31, 46, 14);
        thePanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(128, 28, 86, 20);
        nameField.setColumns(10);
        thePanel.add(nameField);


      /*  model.addEMail(JOptionPane.showInputDialog("Please, type in your email."));
        model.addCellPhone(JOptionPane.showInputDialog("Mobile Number"));
        System.out.println(model);*/

        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(thePanel);

    }
}
