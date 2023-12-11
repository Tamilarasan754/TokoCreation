
public class Registration

{

    private int registration_id;

    private int event_id;

    private int athlete_id;

    private String registration_date;

    public Registration(int registration_id, int event_id, int athlete_id, String registration_date) {

        this.registration_id = registration_id;

        this.event_id = event_id;

        this.athlete_id = athlete_id;

        this.registration_date = registration_date;

    }

    public int getRegistration_id() {
        return registration_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public int getAthlete_id() {
        return athlete_id;
    }

    public String getRegistration_date() {
        return registration_date;
    }
}