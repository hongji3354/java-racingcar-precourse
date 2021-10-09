package racinggame.constant;

public enum ErrorMessage {

    RACING_CAR_NAME_LENGTH_UNDER_ONE("[ERROR] 자동차의 이름은 1자 이상 입니다."),
    RACING_CAR_NAME_LENGTH_OVER_FIVE("[ERROR] 자동차의 이름은 5자 이하 입니다."),
    RACING_CAR_NAME_DUPLICATE("[ERROR] 자동차의 이름은 중복될 수 없습니다."),
    RACING_CAR_MOVE_NUMBER_TIMES_BLANK("[ERROR] 이동 횟수는 빈 값이 될 수 없습니다."),
    RACING_CAR_MOVE_NUMBER_TIMES_NOT_NUMBER("[ERROR] 이동 횟수는 숫자만 가능합니다."),
    RACING_CAT_MOVE_NUMBER_TIMES_ZERO("[ERROR] 이동 횟수는 1 이상 입니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
