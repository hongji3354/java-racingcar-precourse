package racinggame.domain;

import java.util.List;

public class Cars {

    private List<Car> racingCars;

    public Cars(List<Car> racingCars) {
        this.racingCars = racingCars;
    }

    public List<Car> getCars() {
        return racingCars;
    }
}
