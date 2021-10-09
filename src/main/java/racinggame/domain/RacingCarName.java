package racinggame.domain;

import java.util.List;

public class RacingCarName {

    private List<String> carNames;

    public RacingCarName(List<String> carNames) {
        this.carNames = carNames;
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
