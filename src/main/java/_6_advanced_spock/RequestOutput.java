package _6_advanced_spock;

public class RequestOutput {
    private final int httpStatus;

    public RequestOutput(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
