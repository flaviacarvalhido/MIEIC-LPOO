package com.aor.refactoring.example6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tree {         //criar Location class para evitar atributos excessivos e dar override de toString
    public Date plantedAt;
    /*
    public String locationLatitude;
    public String locationLongitude;
    public String locationName;
     */
    public Location location;
    private List<Date> appraisalDates;

    public Tree(Date plantedAt, String locationLatitude, String locationLongitude, String locationName){
        this.plantedAt = plantedAt;
        this.location = new Location(locationLatitude, locationLongitude, locationName);
        this.appraisalDates = new ArrayList<>();
    }


    public void setLocation(String locationLatitude, String locationLongitude, String locationName){        //simplified
        this.location=new Location(locationLatitude,locationLongitude,locationName);
    }


    public String toString() {      //simplified with location.toString()
        return "Tree planted at " + this.plantedAt.toString() + location.toString();
    }

    void addAppraisal(Date appraisalDate) {
        this.appraisalDates.add(appraisalDate);
    }

    public List<Date> getAppraisals(){
        return this.appraisalDates;
    }

    public boolean isNextAppraisalOverdue(){    //long method
        Date today = new Date();

        Date latestAppraisalDate = getLatestAppraisal();

        //calculate latest appraisal date -> method
        /*
        if (this.appraisalDates.size() > 0) {
            latestAppraisalDate = this.appraisalDates.get(0);

            for (Date appraisalDate : this.appraisalDates) {
                if (latestAppraisalDate.before(appraisalDate)) {
                    latestAppraisalDate = appraisalDate;
                }
            }
        }else{
            latestAppraisalDate = today;
        }
         */


        // Calculate next appraisal date ->method
        /*
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(latestAppraisalDate);
        calendar.add(Calendar.MONTH, 3);

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 2);

        Date nextAppraisalDate = calendar.getTime();
         */

        Date nextAppraisalDate = getNextAppraisalDate(latestAppraisalDate);

        // Appraisal is only overdue if its date is in the past
        return nextAppraisalDate.before(today);
    }


    public Date getLatestAppraisal(){
        Date today = new Date();
        Date latestAppraisalDate = today;

        if (this.appraisalDates.size() > 0) {
            latestAppraisalDate = this.appraisalDates.get(0);

            for (Date appraisalDate : this.appraisalDates) {
                if (latestAppraisalDate.before(appraisalDate)) {
                    latestAppraisalDate = appraisalDate;
                }
            }
        }

        return latestAppraisalDate;
    }

    public Date getNextAppraisalDate(Date latest){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(latest);
        calendar.add(Calendar.MONTH, 3);

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 2);

        Date nextAppraisalDate = calendar.getTime();

        return nextAppraisalDate;
    }
}
