package client.app;

import client.domain.Client;
import client.domain.model.DefaultClient;
import client.repository.ClientRepository;

import javax.swing.*;

public class ClientApp {

    public static void main(String[] args) {
        // Troca de mensagem (uso de objetos)
        JFrame window = new JFrame("Client Application");


        JPanel thePanel = new JPanel(null);//Set to null to allow positioning of components

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(65, 31, 46, 14);
        thePanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(128, 31, 86, 20);
        nameField.setColumns(10);
        thePanel.add(nameField);

        JLabel surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(65, 61, 56, 14);
        thePanel.add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(128, 61, 86, 20);
        surnameField.setColumns(10);
        thePanel.add(surnameField);


        Client model = new DefaultClient(nameField.getText(), surnameField.getText()); // Composição
        ClientRepository repository = null;

      /*  model.addEMail(JOptionPane.showInputDialog("Please, type in your email."));
        model.addCellPhone(JOptionPane.showInputDialog("Mobile Number"));
        System.out.println(model);*/


        window.add(thePanel);

        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
