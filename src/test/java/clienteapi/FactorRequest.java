package clienteapi;

public class FactorRequest {

    public static RequestClient make(String type) {
        RequestClient client;
        switch (type) {
            case "put":
                client = new RequestPut();
                break;
            case "post":
                client = new RequestPOST();
                break;
            case "get":
                client = new RequestGET();
                break;
            case "delete":
                client = new RequestDelete();
                break;
            default:
                client = new RequestGET();
                break;
        }
        return client;
    }
}
