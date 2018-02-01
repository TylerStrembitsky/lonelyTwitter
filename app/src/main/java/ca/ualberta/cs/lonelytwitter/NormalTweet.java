package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a normal tweet
 *
 * @author tylerstrembitsky
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet object
     *
     * @param tweet is the text of the tweet
     * @param date is the date of the tweet
     */
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

    /**
     * Constructs a normal tweet object
     *
     * @param tweet is the text of the tweet
     */
    public NormalTweet(String tweet) {
        super(tweet);
    }

    /**
     * Checks if tweet is important
     *
     * @return
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
