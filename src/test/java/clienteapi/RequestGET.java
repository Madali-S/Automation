package clienteapi;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends RequestClient {

    @Override
    public responseinformation send(RequestInformation request) {
        System.out.println("GET" + request.getUrl());

        Response response = this.client.target(request.getUrl())
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(request.getHeaders())
                .get();

        responseinformation responseInformation = new responseinformation();

        response.close();
        return responseInformation;
    }
}





