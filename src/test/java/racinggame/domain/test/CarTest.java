package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import racinggame.domain.Car;
import racinggame.domain.CarForward;
import racinggame.domain.Cars;

class CarTest {

    @ParameterizedTest
    @CsvSource(value = {"false:0", "true:1"}, delimiter = ':')
    void 전진_멈춤(boolean forward, int position) {
        try(final MockedStatic<CarForward> mockCarForward = mockStatic(CarForward.class)) {
            mockCarForward.when(CarForward::forward)
                .thenReturn(forward);

            final Cars cars = new Cars(Arrays.asList(new Car("뽀로로")));

            cars.move();

            assertThat(cars.getCars().get(0).getPosition()).isEqualTo(position);
        }
    }

}
