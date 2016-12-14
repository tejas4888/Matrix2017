package spit.matrix2017.HelperClasses;

/**
 * Created by Rohit on 13/11/16.
 */

public class Event {

    //////////Custom data type for events//////////
    private String name, description, category, venue, time, registration, prizes, contact1_name, contact1_no, contact2_name, contact2_no, color;
    private int image;
    private long favourite, reminder;

    public String getVenue() {
            return venue;
        }

    public String getTime() {
            return time;
        }

    public String getRegistration(){
        return registration;
    }

    public String getPrizes(){
        return prizes;
    }

    public String getContact1_name() {
            return contact1_name;
        }

    public String getContact2_name() {
            return contact2_name;
        }

    public int getImage() {
            return image;
        }

    public String getContact1_no() {
            return contact1_no;
        }

    public String getContact2_no() {
            return contact2_no;
        }

    public String getCategory() {
            return category;
        }

    public String getName() {
            return name;
        }

    public long getFavourite() {
            return favourite;
        }

    public long getReminder() {
            return reminder;
        }

    public String getDescription() {
            return description;
        }

    public String getColor() {
        return color;
    }


    public Event(String name, String description, int image, String category, String venue, String time, String registration, String prizes, String contact1_name, String contact1_no, String contact2_name, String contact2_no, String color) {
            this.name = name;
            this.description = description;
            this.image = image;
            this.category = category;
            this.venue = venue;
            this.time = time;
            this.registration = registration;
            this.prizes = prizes;
            this.contact1_name = contact1_name;
            this.contact1_no = contact1_no;
            this.contact2_name = contact2_name;
            this.contact2_no = contact2_no;
            this.favourite=0;
            this.reminder=0;
            this.color=color;
        }

        public Event(String name, String description, int image, String category, String venue, String time, String registration, String prizes, String contact1_name, String contact1_no, String contact2_name, String contact2_no, int favourite, int reminder, String color)
        {
            //used while fetching data
            this.name = name;
            this.description = description;
            this.image = image;
            this.category = category;
            this.venue = venue;
            this.time = time;
            this.registration = registration;
            this.prizes = prizes;
            this.contact1_name = contact1_name;
            this.contact1_no = contact1_no;
            this.contact2_name = contact2_name;
            this.contact2_no = contact2_no;
            this.favourite=favourite;
            this.reminder=reminder;
            this.color=color;
        }
    }


