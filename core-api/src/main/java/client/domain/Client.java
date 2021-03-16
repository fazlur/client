package client.domain;

import java.util.List;

public interface Client {

    String getFirstName();
    Address getHomeAddress();
    Address getWorkAddress();

    void addEMail(String contact);
    void  addCellPhone(String contact);

    List<Contact> getContacts();

    void validate() throws Exception;
}
