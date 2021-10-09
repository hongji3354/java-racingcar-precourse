package racinggame.domain;

import java.util.List;

public class RacingIntermediateResults {

    private List<RacingIntermediateResult> racingIntermediateResults;

    public RacingIntermediateResults(List<RacingIntermediateResult> racingIntermediateResults) {
        this.racingIntermediateResults = racingIntermediateResults;
    }

    public List<RacingIntermediateResult> getRacingIntermediateResults() {
        return racingIntermediateResults;
    }
}
