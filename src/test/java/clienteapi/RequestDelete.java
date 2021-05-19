package clienteapi;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestDelete  extends RequestClient{

    @Override
    public responseinformation send(RequestInformation request) {
        System.out.println("DELETE"+request.getUrl());

        Response response = this.client.target(request.getUrl())
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(request.getHeaders())
                .delete();

        responseinformation responseInformation = new responseinformation();
        response.getStatus();
        response.close();
        return responseInformation;

    }
}
