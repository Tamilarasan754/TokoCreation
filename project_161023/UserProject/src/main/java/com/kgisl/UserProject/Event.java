package com.kgisl.UserProject;

import com.opencsv.bean.CsvBindByName;

public class Event {
     @CsvBindByName(column = "registration_id")
        private  String registration_id ;
    
        @CsvBindByName(column = "event_name")
        private String event_name;
    
        @CsvBindByName(column = "athlete_name")
        private String athlete_name;

         @CsvBindByName(column = "registration_date")
        private String registration_date;

        public String getRegistration_id() {
            return registration_id;
        }

        public void setRegistration_id(String registration_id) {
            this.registration_id = registration_id;
        }

        public String getEvent_name() {
            return event_name;
        }

        public void setEvent_name(String event_name) {
            this.event_name = event_name;
        }

        public String getAthlete_name() {
            return athlete_name;
        }

        public void setAthlete_name(String athlete_name) {
            this.athlete_name = athlete_name;
        }

        public String getRegistration_date() {
            return registration_date;
        }

        public void setRegistration_date(String registration_date) {
            this.registration_date = registration_date;
        }

        @Override
        public String toString() {
            return "Event [registration_id=" + registration_id + ", event_name=" + event_name + ", athlete_name="
                    + athlete_name + ", registration_date=" + registration_date + "]";
        }

     
        
    
}

