package racinggame.domain;

public class RacingIntermediateResult {

    private String name;
    private String forward;

    public RacingIntermediateResult(String name, String forward) {
        this.name = name;
        this.forward = forward;
    }

    public String getName() {
        return name;
    }

    public String getForward() {
        return forward;
    }
}
