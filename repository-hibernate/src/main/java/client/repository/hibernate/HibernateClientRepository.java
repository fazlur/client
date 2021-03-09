package client.repository.hibernate;

import client.domain.Client;
import client.repository.ClientRepository;

import java.util.List;

public class HibernateClientRepository implements ClientRepository {

    @Override
    public void insert(Client client) {
        // TODO Hibernate implementation
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public List<Client> selectAll() {
        return null;
    }

    @Override
    public List<Client> selectBy(String name) {
        return null;
    }
}
