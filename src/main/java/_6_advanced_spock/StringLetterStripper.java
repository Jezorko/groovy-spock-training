package _6_advanced_spock;

public class StringLetterStripper {
    public String replaceAllALetters(String toReplace) {
        return toReplace.replaceAll("[Aa]", "");
    }

    public String replaceAllBLetters(String toReplace) {
        return toReplace.replaceAll("[Bb]", "");
    }
}
