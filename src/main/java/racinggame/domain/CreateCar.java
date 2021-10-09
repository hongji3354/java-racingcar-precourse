package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CreateCar {

    private CreateCar() {
    }

    public static Cars create(CarNames carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames.getCarNames()) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }
}
