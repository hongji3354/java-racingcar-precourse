package racinggame.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars implements Comparator<Car> {

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

    public RacingResult getRacingWinner() {
        final List<Car> forwardDescendingOrderCars = forwardDescendingOrderCars();
        List<String> winners = new ArrayList<>();

        int index = 1;
        boolean isWinner = true;
        while (isWinner) {
            final Car car = forwardDescendingOrderCars.get(index-1);
            final Car nextCar = forwardDescendingOrderCars.get(index);
            winners.add(car.getName());

            if (!isSamePosition(car, nextCar)) {
                isWinner = false;
            }
            index++;
        }
        return new RacingResult(winners);
    }

    private boolean isSamePosition(Car car, Car nextCar) {
        return car.getPosition() == nextCar.getPosition();
    }

    public List<Car> forwardDescendingOrderCars() {
        final List<Car> copyCars = new ArrayList<>(new ArrayList<>(this.cars));
        copyCars.sort(this::compare);

        return copyCars;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.getPosition(), o1.getPosition());
    }
}
