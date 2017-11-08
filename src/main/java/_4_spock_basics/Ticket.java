package _4_spock_basics;

public class Ticket {
    private final String title;
    private final int estimation;

    public Ticket(String title, int estimation) {
        this.title = title;
        this.estimation = estimation;
    }

    public String getTitle() {
        return title;
    }

    public int getEstimation() {
        return estimation;
    }
}
