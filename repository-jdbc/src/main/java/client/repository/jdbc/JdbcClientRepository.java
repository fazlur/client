package client.repository.jdbc;

import client.domain.Client;
import client.repository.ClientRepository;

import java.sql.Connection;
import java.util.List;

public class JdbcClientRepository implements ClientRepository {

    private Connection connection;

    @Override
    public void insert(Client client) {
//        connection = DriverManager.getConnection("");
//        PreparedStatement statement = connection.prepareStatement("INSERT INTO client....");
//        int id = statement.executeUpdate();
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
