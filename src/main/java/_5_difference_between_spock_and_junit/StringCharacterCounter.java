package _5_difference_between_spock_and_junit;

import java.util.function.Supplier;

public class StringCharacterCounter {
    private Supplier<String> stringSupplier;

    public StringCharacterCounter() {
    }

    public StringCharacterCounter(Supplier<String> stringSupplier) {
        this.stringSupplier = stringSupplier;
    }

    public void setStringSupplier(Supplier<String> stringSupplier) {
        this.stringSupplier = stringSupplier;
    }

    public int countCharactersOfNextString() {
        return stringSupplier.get()
                             .length();
    }
}
