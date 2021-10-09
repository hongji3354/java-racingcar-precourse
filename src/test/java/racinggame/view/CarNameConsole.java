package racinggame.view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import nextstep.utils.Console;
import racinggame.constant.ErrorMessage;
import racinggame.domain.CarNames;

public class CarNameConsole {

    private static final String RACING_CAR_NAME_DELIMITER = ",";
    private static final int RACING_CAR_NAME_MAX_LENGTH = 5;

    private CarNameConsole() {
    }

    public static CarNames read() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        final String racingCarName = Console.readLine();
        final List<String> racingCarNames = Arrays.asList(racingCarName.split(RACING_CAR_NAME_DELIMITER));
        validate(racingCarNames);
        return new CarNames(racingCarNames);
    }

    private static void validate(List<String> racingCarNames) {
        for (String racingCarName : racingCarNames) {
            racingCarNameIsBlankCheck(racingCarName);
            racingCarNameLengthUnderFiveCheck(racingCarName);
        }
        racingCarNameDuplicateCheck(racingCarNames);
    }

    private static void racingCarNameDuplicateCheck(List<String> racingCarNames) {
        final Set<String> nonDuplicateRacingCarNames = new HashSet<>(racingCarNames);
        if (nonDuplicateRacingCarNames.size() != racingCarNames.size()) {
            System.out.println(ErrorMessage.RACING_CAR_NAME_DUPLICATE.getMessage());
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_DUPLICATE.getMessage());
        }
    }

    private static void racingCarNameLengthUnderFiveCheck(String racingCarName) {
        if (racingCarName.length() > RACING_CAR_NAME_MAX_LENGTH) {
            System.out.println(ErrorMessage.RACING_CAR_NAME_LENGTH_OVER_FIVE.getMessage());
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_LENGTH_OVER_FIVE.getMessage());
        }
    }

    private static void racingCarNameIsBlankCheck(String racingCarName) {
        if (racingCarName.trim().isEmpty()) {
            System.out.println(ErrorMessage.RACING_CAR_NAME_LENGTH_UNDER_ONE.getMessage());
            throw new NoSuchElementException(ErrorMessage.RACING_CAR_NAME_LENGTH_UNDER_ONE.getMessage());
        }
    }
}
