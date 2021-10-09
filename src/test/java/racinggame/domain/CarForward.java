package racinggame.domain;

import nextstep.utils.Randoms;

public class CarForward {

    private static final int RANDOM_START = 0;
    private static final int RANDOM_END = 9;
    private static final int FORWARD_CRITERIA = 4;

    public static boolean forward() {
        final int pickNumberInRange = Randoms.pickNumberInRange(RANDOM_START, RANDOM_END);

        return pickNumberInRange>=FORWARD_CRITERIA;
    }

}
