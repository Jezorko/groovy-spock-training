package _6_advanced_spock;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RequestSender {
    public RequestOutput send(String body) {
        return send(buildRequestInput(body));
    }

    public RequestOutput send(RequestInput input) {
        throw new NotImplementedException(); // TODO: stub me!
    }

    public RequestInput buildRequestInput(String body) {
        return new RequestInput(RequestMethod.POST, body);
    }
}
