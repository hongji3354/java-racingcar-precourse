package racinggame.view;

import java.util.List;
import racinggame.domain.RacingResult;

public class RacingResultConsole {

    private RacingResultConsole() {
    }

    public static void write(RacingResult racingResult) {
        StringBuilder winner = new StringBuilder();
        final List<String> winners = racingResult.getWinners();
        for (int i=0; i< winners.size(); i++) {
            winner.append(winners.get(i));
            isNextWinner(winner, winners, i);
        }
        System.out.println("최종 우승자는 " + winner + " 입니다.");
    }

    private static void isNextWinner(StringBuilder winner, List<String> winners, int i) {
        if (i != winners.size() - 1) {
            winner.append(",");
        }
    }
}
