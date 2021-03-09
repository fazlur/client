package client.repository;

import client.domain.Address;
import client.domain.Client;

public interface AddressRepository {

    void insert(Address model);

    void update(Address model);

    void delete(Address model);

    Address findByClient(Client client);

    Address findById(Long id);
}
