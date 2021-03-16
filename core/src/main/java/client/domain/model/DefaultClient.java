package client.domain.model;

import client.domain.Address;
import client.domain.Client;
import client.domain.Contact;

import java.util.ArrayList;
import java.util.List;

// Definir o objeto
public class DefaultClient implements Client {

    // Estado (O que é?)
    private final String firstName;

    private String middleName;

    private String surname;

    private Address homeAddress;
    private WorkAddress workAddress;

    private final List<Contact> contacts = new ArrayList<>(); // Polimorfismo

    // Construtor (Como construir?)
    // Objetivo de um construtor é definir o estado inicial deste objeto
    public DefaultClient(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("The first name is null!");
        }

        this.firstName = firstName;
    }
    public DefaultClient(String firstName, String surname) {
        this(firstName);
        this.surname = surname;
    }

    // Comportamentos (O que ele faz?)
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public Address getHomeAddress() {
        return homeAddress;
    }

    @Override
    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void addEMail(String contact) {
        add(new EMailContact(contact));
    }

    @Override
    public void addCellPhone(String contact) {
        add(new CellPhoneContact(contact));
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void validate() throws Exception {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public String toString() {
        return "DefaultClient{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
