package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racinggame.domain.Car;
import racinggame.domain.CarForward;
import racinggame.domain.Cars;
import racinggame.domain.CreateRacingIntermediateResult;
import racinggame.domain.RacingIntermediateResults;

class RacingIntermediateResultTest {

    @Test
    void 경주_중간_결과() {
        try(final MockedStatic<CarForward> mockCarForward = mockStatic(CarForward.class)) {
            mockCarForward.when(CarForward::forward)
                .thenReturn(true);

            final Cars cars = new Cars(Arrays.asList(new Car("rupee")));
            cars.forward();

            final RacingIntermediateResults racingIntermediateResults = CreateRacingIntermediateResult.racingIntermediateResult(cars);

            assertThat(racingIntermediateResults.getRacingIntermediateResults().get(0).getName()).isEqualTo("rupee");
            assertThat(racingIntermediateResults.getRacingIntermediateResults().get(0).getForward()).isEqualTo("-");
        }
    }

}
