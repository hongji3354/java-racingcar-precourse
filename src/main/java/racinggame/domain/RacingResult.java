package racinggame.domain;

import java.util.List;

public class RacingResult {

    private List<String> winners;

    public RacingResult(List<String> winners) {
        this.winners = winners;
    }

    public List<String> getWinners() {
        return winners;
    }
}
