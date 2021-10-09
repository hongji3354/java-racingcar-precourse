package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import racinggame.domain.CreateCar;
import racinggame.domain.Cars;
import racinggame.domain.CarNames;

class CreateCarTest {

    @Test
    void 차_생성_테스트() {
        //given
        final CarNames carNames = new CarNames(Arrays.asList("포비", "뽀로로", "크롱"));

        //when
        final Cars racingCar = CreateCar.create(carNames);

        //then
        assertThat(racingCar.getCars().size()).isEqualTo(3);
    }
}
