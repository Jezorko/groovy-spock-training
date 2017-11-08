package _6_advanced_spock;

public class SpecificServiceRequestSender {
    private final RequestSender sender;
    private final RequestOutputValidator validator;

    public SpecificServiceRequestSender(RequestSender sender, RequestOutputValidator validator) {
        this.sender = sender;
        this.validator = validator;
    }

    public RequestOutput send() {
        RequestOutput output = sender.send("Specific request");
        validator.validate(output);
        return output;
    }
}
