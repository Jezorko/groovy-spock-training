package _6_advanced_spock;

public class RequestInput {
    private final RequestMethod requestMethod;
    private final String requestBody;

    public RequestInput(RequestMethod requestMethod, String requestBody) {
        this.requestMethod = requestMethod;
        this.requestBody = requestBody;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public String getRequestBody() {
        return requestBody;
    }
}
