package racinggame.domain;

import racinggame.view.CarMoveNumberTimesConsole;
import racinggame.view.CarNameConsole;
import racinggame.view.RacingResultConsole;

public class RacingGame {

    public void start() {
        final CarNames carNames = CarNameConsole.read();
        final CarMoveNumberTimes carMoveNumberTimes = CarMoveNumberTimesConsole.read();
        final Cars cars = CreateCar.create(carNames);

        carMoveNumberTimes.moveAttempt(cars);

        RacingResultConsole.write(cars.getRacingWinner());
    }
}
