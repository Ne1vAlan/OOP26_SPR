package Practice_2.Task3;

class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h >= 0 && h < 24)
            hour = h;
        else
            hour = 0;

        if (m >= 0 && m < 60)
            minute = m;
        else
            minute = 0;

        if (s >= 0 && s < 60)
            second = s;
        else
            second = 0;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour;
        String period = "AM";

        if (hour >= 12) {
            period = "PM";
            if (hour > 12)
                h = hour - 12;
        }

        if (h == 0)
            h = 12;

        return String.format("%02d:%02d:%02d %s", h, minute, second, period);
    }

    public void add(Time t) {
        second += t.second;
        minute += t.minute;
        hour += t.hour;

        minute += second / 60;
        second = second % 60;

        hour += minute / 60;
        minute = minute % 60;

        hour = hour % 24;
    }
}

