package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tylerstrembitsky on 2018-01-17.
 */

public class SadMood extends Mood {

    public SadMood(){

        super();

    }

    public SadMood(Date myDate) {

        super(myDate);

    }

    public String getMood() {

        return "Sad";

    }
}
