package racinggame.view.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import racinggame.constant.ErrorMessage;
import racinggame.domain.CarNames;
import racinggame.view.CarNameConsole;

class CarNameConsoleTest {

    void consoleRead(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    @Test
    void 구분자() {
        consoleRead("포비,뽀로로,크롱");
        final CarNames carNames = CarNameConsole.read();
        assertThat(carNames.getCarNames()).contains("포비","뽀로로","크롱");
    }

    @Test
    void 자동차_이름_1자_미만_예외() {
        consoleRead("뽀로로, ");
        assertThatThrownBy(CarNameConsole::read)
            .isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_NAME_LENGTH_UNDER_ONE.getMessage());
    }

    @Test
    void 자동차_이름_5자_초과_예외() {
        consoleRead("포비,크롱루피포비");
        assertThatThrownBy(CarNameConsole::read)
            .isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_NAME_LENGTH_OVER_FIVE.getMessage());
    }

    @Test
    void 자동차_이름_중복_예외() {
        consoleRead("루피,크롱,크롱");
        assertThatThrownBy(CarNameConsole::read)
            .isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_NAME_DUPLICATE.getMessage());
    }
}
