package _4_spock_basics;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class TicketGenerator {

    private final static List<String> TITLES = asList("Dodanie funkcjonalności do aplikacji",
                                                      "Założenie serwera", "Poprawienie buga",
                                                      "Napisanie testów", "Wrzutka produkcyjna");

    private final Random randomGenerator;

    public TicketGenerator(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public Ticket generate() {
        String title = TITLES.get(randomGenerator.nextInt(TITLES.size()));
        int estimation = randomGenerator.nextInt(100);
        return new Ticket(title, estimation);
    }
}
