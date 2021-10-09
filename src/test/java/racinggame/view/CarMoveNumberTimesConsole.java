package racinggame.view;

import java.util.NoSuchElementException;
import nextstep.utils.Console;
import racinggame.constant.ErrorMessage;
import racinggame.domain.CarMoveNumberTimes;

public class CarMoveNumberTimesConsole {

    private static final String RACING_GAME_MOVE_NUMBER_TIMES_READ = "0";

    private CarMoveNumberTimesConsole() {
    }

    public static CarMoveNumberTimes read() {
        System.out.println("시도할 회수는 몆회인가요?");
        final String racingGameMoveNumberTimes = Console.readLine();
        validate(racingGameMoveNumberTimes);
        return new CarMoveNumberTimes(Integer.parseInt(racingGameMoveNumberTimes));
    }

    private static void validate(String racingGameMoveNumberTimes) {
        racingGameMoveNumberTimesIsBlankCheck(racingGameMoveNumberTimes);
        racingGameMoveNumberTimesIsNumberCheck(racingGameMoveNumberTimes);
        racingGameMoveNumberTimesIsZeroCheck(racingGameMoveNumberTimes);
    }

    private static void racingGameMoveNumberTimesIsZeroCheck(String racingGameMoveNumberTimes) {
        if (RACING_GAME_MOVE_NUMBER_TIMES_READ.equals(racingGameMoveNumberTimes)) {
            throw new NoSuchElementException(ErrorMessage.RACING_CAT_MOVE_NUMBER_TIMES_ZERO.getMessage());
        }
    }

    private static void racingGameMoveNumberTimesIsNumberCheck(String racingGameMoveNumberTimes) {
        try {
            Integer.parseInt(racingGameMoveNumberTimes);
        }catch (NumberFormatException e){
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_MOVE_NUMBER_TIMES_NOT_NUMBER.getMessage());
        }
    }

    private static void racingGameMoveNumberTimesIsBlankCheck(String racingGameMoveNumberTimes) {
        if (racingGameMoveNumberTimes.trim().isEmpty()) {
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_MOVE_NUMBER_TIMES_BLANK.getMessage());
        }
    }

}
