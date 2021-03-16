package client.domain.model;

import client.domain.Contact;

public class PhoneContact implements Contact {

    // Estado
    private String value;

    //Contrutor

    public PhoneContact(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PhoneContact{" +
                "value='" + value + '\'' +
                '}';
    }
}
