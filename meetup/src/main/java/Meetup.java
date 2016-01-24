import org.joda.time.DateTime;

public class Meetup {
    private int month;
    private int year;

    public Meetup(int month, int year){
        this.month = month;
        this.year = year;
    }

    public DateTime day(int weekday, MeetupSchedule schedule){
        DateTime day = null;
        switch(schedule){
            case FIRST:
                day = findDay(weekday, 1, 7, 1);
                break;
            case SECOND:
                day = findDay(weekday, 8, 14, 1);
                break;
            case THIRD:
                day = findDay(weekday, 15, 21, 1);
                break;
            case FOURTH:
                day = findDay(weekday, 22, 28, 1);
                break;
            case LAST:
                int lastDay = new DateTime(year, month,1, 0,0).dayOfMonth().getMaximumValue();
                day = findDay(weekday, lastDay, lastDay - 7, -1);
                break;
            case TEENTH:
                day = findDay(weekday, 13, 19, 1);
                break;
        }
        return day;

    }



    private DateTime findDay(int weekday, int start, int stop, int step) {
        DateTime day = new DateTime(year, month, start, 0, 0);
        for (; day.getDayOfMonth() != stop + step; day = day.plusDays(step)) {
            if (day.getDayOfWeek() == weekday)
                break;
        }
        return day;
    }
}
