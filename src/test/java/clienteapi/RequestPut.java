package clienteapi;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestPut extends RequestClient {

    @Override
    public responseinformation send(RequestInformation request) {
        System.out.println("PUT" + request.getUrl());
        System.out.println("body " + request.getBody());

        Response response = this.client.target(request.getUrl())
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(request.getHeaders())
                .put(Entity.json(request.getBody()));

        responseinformation responseInformation = new responseinformation();
        response.getStatus();
        response.close();
        return responseInformation;
    }
}
