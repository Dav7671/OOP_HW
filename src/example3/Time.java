package example3;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if(seconds >= 60){
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        if(minutes >= 60){
            hours += minutes / 60;
            minutes = minutes % 60;
        }

        if(hours >= 24){
            hours = hours % 24;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.println("The current time is \t" + hours + ":" + minutes
                + ":" + seconds);
    }

}
