package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tylerstrembitsky on 2018-01-17.
 */

public abstract class Mood {

    private Date myDate;

    public Mood(){

        this.myDate = new Date();

    }

    public Mood(Date myDate){

        this.myDate = new Date();

    }

    public Date getDate(){

        return myDate;

    }

    public void setDate(Date date) {

        this.myDate = date;

    }

}
