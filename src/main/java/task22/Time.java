package task22;

public class Time {

    private int hour;
    private int minut;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minut = m;
        second = s;
    }

    public Time(int allsec) {
        second = allsec;
    }

    public int returnAllSecond() {
        return hour * 3600 + minut * 60 + second;
    }

    public void Time() {
        System.out.println("Time1 = " + second);
    }

    public void AllTime() {
        System.out.println(String.format("Time2 =  %s hours, %s minuts, %s seconds", hour, minut, second));
    }

    public void compareTime() {
        if (this.second >= this.returnAllSecond()) {
            System.out.println("Time1 => Time2");
        } else {
            System.out.println("Time1 < Time2");
        }
        this.returnAllSecond();
    }
}

