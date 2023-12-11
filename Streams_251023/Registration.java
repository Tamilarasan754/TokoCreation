import java.time.LocalDate;

public class Registration {
    private int registration_id;
    private String event_name;
    private String athlete_name;
    private LocalDate registration_date;


    Registration(int registration_id,String event_name,String athlete_name,LocalDate registration_date)
    {
        this.registration_id=registration_id;
        this.event_name=event_name;
        this.athlete_name=athlete_name;
        this.registration_date=registration_date;
    }


    public int getRegistration_id() {
        return registration_id;
    }


    public String getEvent_name() {
        return event_name;
    }


    public String getAthlete_name() {
        return athlete_name;
    }


    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }


    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }


    public void setAthlete_name(String athlete_name) {
        this.athlete_name = athlete_name;
    }


    public void setRegistration_date(LocalDate registration_date) {
        this.registration_date = registration_date;
    }


    public LocalDate getRegistration_date() {
        return registration_date;
    }
    
@Override
    public String toString() {
        return "Registration [registration_id=" + registration_id + ", event_name=" + event_name + ", athlete_name="
                + athlete_name + ", registration_date=" + registration_date + "]";
    }

    
    
}
