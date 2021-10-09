package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import racinggame.domain.CreateRacingCar;
import racinggame.domain.RacingCars;
import racinggame.domain.RacingCarName;

class CreateRacingCarTest {

    @Test
    void 차_생성_테스트() {
        //given
        final RacingCarName racingCarName = new RacingCarName(Arrays.asList("포비", "뽀로로", "크롱"));

        //when
        final RacingCars racingCar = CreateRacingCar.create(racingCarName);

        //then
        assertThat(racingCar.getCars().size()).isEqualTo(3);
    }
}
