package client.domain.model;

import client.domain.Contact;

public class EMailContact implements Contact {

    // Estado
    private String value;

    public EMailContact(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EMailContact{" +
                "value='" + value + '\'' +
                '}';
    }
}
