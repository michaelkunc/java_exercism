import org.joda.time.DateTime;

public class Meetup {
    private int month;
    private int year;

    public Meetup(int month, int year){
        this.month = month;
        this.year = year;
    }

    public DateTime day(int weekday, MeetupSchedule schedule){
        DateTime day;
        switch(schedule){
            case FIRST:
                day =

        }


        return day;

    }

    private DateTime findDay(int weekday, int start, int stop, int step){
        DateTime day = new DateTime(year,month, 0,0);
    }
}
