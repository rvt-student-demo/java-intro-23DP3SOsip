package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        double avg = 1.0 * this.sum/this.count;
        return avg;
    }
}

