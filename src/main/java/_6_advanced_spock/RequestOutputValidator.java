package _6_advanced_spock;

public class RequestOutputValidator {
    public void validate(RequestOutput requestOutput) {
        if (requestOutput.getHttpStatus() / 100 != 2) {
            throw new RuntimeException("Status is not success");
        }
    }
}
