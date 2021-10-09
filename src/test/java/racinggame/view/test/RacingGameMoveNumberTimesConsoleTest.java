package racinggame.view.test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import racinggame.constant.ErrorMessage;
import racinggame.view.RacingGameMoveNumberTimesConsole;

class RacingGameMoveNumberTimesConsoleTest {

    void consoleRead(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    @Test
    void 이동_횟수가_공백_일시_예외() {
        consoleRead(" ");
        assertThatThrownBy(RacingGameMoveNumberTimesConsole::read).isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_MOVE_NUMBER_TIMES_BLANK.getMessage());
    }

    @Test
    void 이동_횟수가_0_일시_예외() {
        consoleRead("0");
        assertThatThrownBy(RacingGameMoveNumberTimesConsole::read).isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAT_MOVE_NUMBER_TIMES_ZERO.getMessage());
    }

    @Test
    void 이동_횟수가_숫자가_아닐_경우_예외() {
        consoleRead("두번");
        assertThatThrownBy(RacingGameMoveNumberTimesConsole::read).isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_MOVE_NUMBER_TIMES_NOT_NUMBER.getMessage());
    }

    @Test
    void 이동_횟수에_공백이_포함되어_있을_경우_예외() {
        consoleRead("1 2");
        assertThatThrownBy(RacingGameMoveNumberTimesConsole::read).isInstanceOf(NoSuchElementException.class)
            .hasMessage(ErrorMessage.RACING_CAR_MOVE_NUMBER_TIMES_NOT_NUMBER.getMessage());
    }
}
