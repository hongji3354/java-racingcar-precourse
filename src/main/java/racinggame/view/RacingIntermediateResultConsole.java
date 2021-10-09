package racinggame.view;

import racinggame.domain.RacingIntermediateResult;
import racinggame.domain.RacingIntermediateResults;

public class RacingIntermediateResultConsole {

    private RacingIntermediateResultConsole() {
    }

    public static void write(RacingIntermediateResults results) {
        for (RacingIntermediateResult racingIntermediateResult : results.getRacingIntermediateResults()) {
            System.out.println(racingIntermediateResult.getName() + " : " + racingIntermediateResult.getForward());
        }
        System.out.println();
    }
}
