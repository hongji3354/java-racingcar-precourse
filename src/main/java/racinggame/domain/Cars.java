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

    public void forward() {
        for(Car car : this.cars) {
            if (CarForward.forward()) {
                car.forward();
            }
        }
    }

    public RacingResult getRacingWinner() {
        final List<Car> forwardDescendingOrderCars = forwardDescendingOrderCars();
        List<String> winners = new ArrayList<>();
        final Car firstWinner = forwardDescendingOrderCars.get(0);

        winners.add(firstWinner.getName());
        for (int i=1; i<forwardDescendingOrderCars.size(); i++) {
            final Car winnerNextCar = forwardDescendingOrderCars.get(i);
            winnerSeveralPeopleCheck(winners, firstWinner, winnerNextCar);
        }

        return new RacingResult(winners);
    }

    private void winnerSeveralPeopleCheck(List<String> winners, Car firstWinner, Car car) {
        if (isSamePosition(firstWinner, car)) {
            winners.add(car.getName());
        }
    }

    private boolean isSamePosition(Car firstWinner, Car car) {
        return firstWinner.getPosition() == car.getPosition();
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
