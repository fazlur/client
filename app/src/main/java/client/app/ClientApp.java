package client.app;

import client.domain.Client;
import client.domain.model.DefaultClient;
import client.repository.ClientRepository;

import javax.swing.*;

public class ClientApp  {

    public static void main(String[] args) {
        // Troca de mensagem (uso de objetos)
        JFrame window = new JFrame("Client Application");
        JButton submitButton = new JButton("Submit");
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

        JLabel cellPhoneLabel = new JLabel("CellPhone");
        cellPhoneLabel.setBounds(65, 91, 86, 20);
        thePanel.add(cellPhoneLabel);

        JTextField cellPhoneField = new JTextField();
        cellPhoneField.setBounds(128, 91, 86, 20);
        cellPhoneField.setColumns(11);
        thePanel.add(cellPhoneField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(65, 121, 86, 20);
        thePanel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(128, 121, 186, 20);
        emailField.setColumns(50);
        thePanel.add(emailField);

        /*  model.addEMail(JOptionPane.showInputDialog("Please, type in your email."));
        model.addCellPhone(JOptionPane.showInputDialog("Mobile Number"));
        System.out.println(model);*/

        submitButton.setBounds(158, 300, 86, 20);
        thePanel.add(submitButton);

  /*      submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        Client model = new DefaultClient(nameField.getText(), surnameField.getText()); // Composição
        ClientRepository repository = null;
        model.addEMail(emailField.getText());
        model.addCellPhone(cellPhoneField.getText());
        //System.out.println(model);

        window.add(thePanel);

        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);


    }


}
