package racinggame.view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import nextstep.utils.Console;
import racinggame.constant.ErrorMessage;
import racinggame.domain.RacingCarName;

public class RacingGameConsole {

    private static final String RACING_CAR_NAME_DELIMITER = ",";

    private RacingGameConsole() {
    }

    public static RacingCarName racingCarNameRead() {
        final String racingCarName = Console.readLine();
        final List<String> racingCarNames = Arrays.asList(racingCarName.split(RACING_CAR_NAME_DELIMITER));
        racingCarNameValidate(racingCarNames);
        return new RacingCarName(racingCarNames);
    }

    private static void racingCarNameValidate(List<String> racingCarNames) {
        for (String racingCarName : racingCarNames) {
            racingCarNameIsBlankCheck(racingCarName);
            racingCarNameLengthUnderFiveCheck(racingCarName);
        }
        racingCarNameDuplicateCheck(racingCarNames);
    }

    private static void racingCarNameDuplicateCheck(List<String> racingCarNames) {
        final Set<String> nonDuplicateRacingCarNames = new HashSet<>(racingCarNames);
        if (nonDuplicateRacingCarNames.size() != racingCarNames.size()) {
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_DUPLICATE.getMessage());
        }
    }

    private static void racingCarNameLengthUnderFiveCheck(String racingCarName) {
        if (racingCarName.length() > 5) {
             throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_LENGTH_OVER_FIVE.getMessage());
        }
    }

    private static void racingCarNameIsBlankCheck(String racingCarName) {
        if (racingCarName.trim().isEmpty()) {
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_LENGTH_UNDER_ONE.getMessage());
        }
    }
}
