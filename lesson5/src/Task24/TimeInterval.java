package Task24;

public class TimeInterval {
    private int second;
    private int minute;
    private int hours;

    public TimeInterval(int second) {
        this.hours = second/3600;
        this.minute = (second - hours * 3600) /60;
        this.second = second - hours * 3600 - minute * 60;
    }

    public TimeInterval(int hours, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hours = hours;
    }

    public int secondSum() {
        return second + minute * 60 + hours * 3600;
    }

    public int compareTime(TimeInterval timeTwo) {
        int timeOne = second + minute * 60 + hours * 3600;
        int timeTwoSum = timeTwo.secondSum();
        return timeOne - timeTwoSum;
    }

    public String printTime() {
        return "hours = " + hours + ", minute = " + minute + ", second = " + second;
    }
}

