package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CreateRacingCar {

    private CreateRacingCar() {
    }

    public static RacingCars create(RacingCarName racingCarName) {
        List<RacingCar> racingCars = new ArrayList<>();
        for (String carName : racingCarName.getCarNames()) {
            racingCars.add(new RacingCar(carName));
        }
        return new RacingCars(racingCars);
    }
}
