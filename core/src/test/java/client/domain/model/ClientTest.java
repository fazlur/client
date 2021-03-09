package client.domain.model;

import client.domain.Client;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test(expected = IllegalArgumentException.class)
    public void clientInvalidNameTest() throws Exception {
        Client model = new DefaultClient();

        model.validate();
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void clientEmptyNameTest() throws Exception {
        Client model = new DefaultClient();

        model.setName("");
        model.validate();
        Assert.fail();
    }

    @Test
    public void clientValidNameTest() throws Exception {
        Client model = new DefaultClient();

        model.setName("Faz");
        model.validate();
    }
}
