package racinggame.domain;

import racinggame.view.RacingMoveNumberTimesResultConsole;

public class CarMoveNumberTimes {

    private int moveNumberTimes;

    public CarMoveNumberTimes(int moveNumberTimes) {
        this.moveNumberTimes = moveNumberTimes;
    }

    public void moveAttempt(Cars cars) {
        System.out.println("실행 결과");
        for (int i=0; i<this.moveNumberTimes; i++) {
            cars.move();
            RacingMoveNumberTimesResultConsole.write(CreateRacingIntermediateResult.racingIntermediateResult(cars));
        }
    }
}
