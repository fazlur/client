package client.domain;

public interface Client {

    String getName();

    void setName(String name);

    void validate() throws Exception;
}
