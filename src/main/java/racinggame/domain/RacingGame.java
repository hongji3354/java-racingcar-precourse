package racinggame.domain;

import racinggame.view.CarMoveNumberTimesConsole;
import racinggame.view.CarNameConsole;
import racinggame.view.RacingIntermediateResultConsole;
import racinggame.view.RacingResultConsole;

public class RacingGame {

    public void start() {
        final CarNames carNames = CarNameConsole.read();
        final CarMoveNumberTimes carMoveNumberTimes = CarMoveNumberTimesConsole.read();
        final Cars cars = CreateCar.create(carNames);

        System.out.println("실행 결과");
        for (int i=0; i<carMoveNumberTimes.getMoveNumberTimes(); i++) {
            cars.forward();
            RacingIntermediateResultConsole.write(CreateRacingIntermediateResult.racingIntermediateResult(cars));
       }
        RacingResultConsole.write(cars.getRacingWinner());
    }
}
