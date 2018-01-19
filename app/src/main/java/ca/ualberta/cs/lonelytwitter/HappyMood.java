package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tylerstrembitsky on 2018-01-17.
 */

public class HappyMood extends Mood {

    public HappyMood(){

        super();

    }

    public HappyMood(Date myDate) {

        super(myDate);

    }

    public String getMood() {

        return "Happy";

    }
}
