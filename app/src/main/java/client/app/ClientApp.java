package client.app;

import client.app.view.MainView;
import client.domain.Client;
import client.domain.model.DefaultClient;
import client.repository.ClientRepository;

import javax.swing.*;

public class ClientApp  {

    public static void main(String[] args) {
        // Troca de mensagem (uso de objetos)
        SwingUtilities.invokeLater(() -> {
            final JFrame window = new MainView();

            window.setVisible(true);
        });

        //        JButton submitButton = new JButton("Submit");
//        JPanel thePanel = new JPanel(null);//Set to null to allow positioning of components
//
//        JLabel nameLabel = new JLabel("Name");
//        nameLabel.setBounds(65, 31, 46, 14);
//        thePanel.add(nameLabel);
//
//        JTextField nameField = new JTextField();
//        nameField.setBounds(128, 31, 86, 20);
//        nameField.setColumns(10);
//        thePanel.add(nameField);
//
//        JLabel surnameLabel = new JLabel("Surname");
//        surnameLabel.setBounds(65, 61, 56, 14);
//        thePanel.add(surnameLabel);
//
//        JTextField surnameField = new JTextField();
//        surnameField.setBounds(128, 61, 86, 20);
//        surnameField.setColumns(10);
//        thePanel.add(surnameField);
//
//        JLabel cellPhoneLabel = new JLabel("CellPhone");
//        cellPhoneLabel.setBounds(65, 91, 86, 20);
//        thePanel.add(cellPhoneLabel);
//
//        JTextField cellPhoneField = new JTextField();
//        cellPhoneField.setBounds(128, 91, 86, 20);
//        cellPhoneField.setColumns(11);
//        thePanel.add(cellPhoneField);
//
//        JLabel emailLabel = new JLabel("Email");
//        emailLabel.setBounds(65, 121, 86, 20);
//        thePanel.add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(128, 121, 186, 20);
//        emailField.setColumns(50);
//        thePanel.add(emailField);
//
//        /*  model.addEMail(JOptionPane.showInputDialog("Please, type in your email."));
//        model.addCellPhone(JOptionPane.showInputDialog("Mobile Number"));
//        System.out.println(model);*/
//
//        submitButton.setBounds(158, 300, 86, 20);
//        thePanel.add(submitButton);
//
//
//        // Lambda
//        submitButton.addActionListener(e -> saveClient(
//                nameField.getText(),
//                surnameField.getText(),
//                cellPhoneField.getText(),
//                emailField.getText()));
//
//        window.add(thePanel);
    }

    static void saveClient(String nameField, String surnameField, String cellPhoneField, String emailField) {
        Client model = new DefaultClient(nameField, surnameField); // Composição
        ClientRepository repository = null;
        model.addEMail(emailField);
        model.addCellPhone(cellPhoneField);
        System.out.println(model);
    }
}
