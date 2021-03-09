package client.domain.model;

import client.domain.Client;

import java.util.Objects;

public class DefaultClient implements Client {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void validate() throws Exception {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }
}
