package racinggame.domain.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import nextstep.utils.Randoms;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import racinggame.domain.CarForward;

class CarForwardTest {

    @ParameterizedTest
    @CsvSource(value = {"3:false", "4:true"}, delimiter = ':')
    void 숫자_4_기준_으로_전진_멈춤(int pickNumberInRange, boolean result) {
        try(final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)){
            mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(pickNumberInRange);

            assertThat(CarForward.forward()).isEqualTo(result);
        }
    }

}
