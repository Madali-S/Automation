package clienteapi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public abstract class RequestClient {
    Client client = ClientBuilder.newBuilder().build();
    public abstract responseinformation send (RequestInformation request);
}
