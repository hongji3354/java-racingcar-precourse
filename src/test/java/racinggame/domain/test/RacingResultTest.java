package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racinggame.domain.Car;
import racinggame.domain.CarForward;
import racinggame.domain.Cars;
import racinggame.domain.RacingResult;

class RacingResultTest {

    @Test
    void 우승자_1_명() {
        final Car rupee = new Car("rupee");
        final Car pororo = new Car("pororo");

        rupee.forward();

        final Cars cars = new Cars(Arrays.asList(rupee, pororo));
        final RacingResult racingWinner = cars.getRacingWinner();

        assertThat(racingWinner.getWinners()).contains("rupee");
    }

    @Test
    void 우승자_여러_명() {
        try(final MockedStatic<CarForward> mockCarForward = mockStatic(CarForward.class)) {
            mockCarForward.when(CarForward::forward).thenReturn(true);

            final Car rupee = new Car("rupee");
            final Car pororo = new Car("pororo");
            final Car pobi = new Car("pobi");
            final Car jihun = new Car("jihun");

            rupee.forward();
            rupee.forward();
            rupee.forward();
            rupee.forward();

            pororo.forward();

            pobi.forward();
            pobi.forward();
            pobi.forward();
            pobi.forward();

            jihun.forward();
            jihun.forward();
            jihun.forward();
            jihun.forward();

            final Cars cars = new Cars(Arrays.asList(rupee, pororo, pobi, jihun));

            final RacingResult racingWinner = cars.getRacingWinner();

            assertThat(racingWinner.getWinners()).contains("rupee","jihun","pobi");
        }
    }
}
