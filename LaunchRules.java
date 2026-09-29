public class LaunchRules {

    // Part A: move the ! inside. No !( and no !! in the answer.

    // Returns true when the launch is called off.
    // First draft: !(windMph < 20 && skyClear)
    // to-do: rewrite the first draft with De Morgan's laws
    public boolean isScrubbed(int windMph, boolean skyClear) {
        return (windMph >= 20 || !skyClear);
    }

    // Returns true when the launch director can say go.
    // First draft: !(abortCalled || !ignitionOk)
    // to-do: rewrite the first draft with De Morgan's laws
    public boolean isGo(boolean abortCalled, boolean ignitionOk) {
        return (!abortCalled && ignitionOk);
    }

    // Returns true when the launch may go ahead.
    // First draft: !(windMph >= 20 || abortCalled || (!ignitionOk && !backupLoaded))
    // to-do: rewrite the first draft with De Morgan's laws
    public boolean canLaunch(int windMph, boolean abortCalled,
            boolean ignitionOk, boolean backupLoaded) {
        return (windMph < 20 && !abortCalled && (ignitionOk || backupLoaded));
    }

    // Part B: pull the ! out. One !( around the whole condition.

    // Returns true unless x and y are both positive.
    // First draft: x <= 0 || y <= 0
    // to-do: rewrite the first draft as one ! in front of parentheses
    public boolean notBothPositive(int x, int y) {
        return !(x > 0 && y > 0);
    }

    // Returns true when fueling is safe.
    // First draft: tempF <= 95 && !sparkNearby
    // to-do: rewrite the first draft as one ! in front of parentheses
    public boolean canFuel(int tempF, boolean sparkNearby) {
        return !(tempF > 95 || sparkNearby);
    }

    // Returns true when the range officer holds the launch.
    // First draft: windMph >= 20 || !skyClear || abortCalled || !rangeSafe
    // to-do: rewrite the first draft as one ! in front of parentheses
    public boolean isHold(int windMph, boolean skyClear,
            boolean abortCalled, boolean rangeSafe) {
        return !(windMph < 20 && skyClear && !abortCalled && rangeSafe);
    }
}