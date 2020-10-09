public class Hour {
    private int hours;
    private int minutes;
    private int seconds;

    public Hour() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Hour(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void SetHours(int hours) {
        this.hours = hours;
    }

    public void SetMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void SetSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int GetHours() {
        return this.hours;
    }
}