package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CreateRacingIntermediateResult {

    private static final String FORWARD_EXPRESSION = "-";

    private CreateRacingIntermediateResult() {
    }

    public static RacingIntermediateResults racingIntermediateResult(Cars cars) {
        List<RacingIntermediateResult> racingIntermediateResults = new ArrayList<>();
        for (Car car : cars.getCars()) {
            StringBuilder forwardExpression = getForwardExpression(car);
            racingIntermediateResults.add(new RacingIntermediateResult(car.getName(), forwardExpression.toString()));
        }
        return new RacingIntermediateResults(racingIntermediateResults);
    }

    private static StringBuilder getForwardExpression(Car car) {
        StringBuilder forward = new StringBuilder();
        for (int i=1; i<= car.getPosition(); i++) {
            forward.append(FORWARD_EXPRESSION);
        }
        return forward;
    }
}
