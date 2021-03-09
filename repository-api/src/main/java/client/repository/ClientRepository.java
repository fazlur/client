package client.repository;

import client.domain.Client;

import java.util.List;

public interface ClientRepository {

    void insert(Client client);

    void update(Client client);

    void delete(Client client);

    Client findById(Long id);

    List<Client> selectAll();

    List<Client> selectBy(String name);
}
