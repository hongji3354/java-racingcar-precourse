package racinggame.domain;

import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void carForward() {
        for(Car car : this.cars) {
            if (CarForward.forward()) {
                car.forward();
            }
        }
    }
}
