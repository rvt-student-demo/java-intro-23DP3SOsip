package lv.rvt;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths_of_second;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths_of_second = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredths_of_second.advance();

        if (this.hundredths_of_second.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + " seconds, " + this.hundredths_of_second + " hundredths of a second.";
    }
}

