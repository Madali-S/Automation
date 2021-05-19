package clienteapi;

public class responseinformation {
    private String responseBody;
    private String responseMessage;
    private int responseCode;

    public responseinformation(){}

    public responseinformation(String responseBody, String responseMessage, int responceCode) {
        this.responseBody = responseBody;
        this.responseMessage = responseMessage;
        this.responseCode = responceCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}

