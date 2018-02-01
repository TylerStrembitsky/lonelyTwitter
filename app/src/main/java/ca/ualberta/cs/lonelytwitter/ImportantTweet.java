package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an important tweet
 *
 * @author tylerstrembitsky
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an important tweet
     *
     * @param tweet is the text of the tweet
     * @param date is the date of the tweet
     */
    public ImportantTweet(String tweet, Date date) {
        super(tweet, date);
        this.setText(tweet);
        this.date = date;
    }

    /**
     * Constructs an important tweet
     *
     * @param tweet is the text of the tweet
     */
    public ImportantTweet(String tweet) {
        super(tweet);
    }

    /**
     * Constructs an important tweet
     *
     * @return
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Gets text for tweet
     *
     * @return
     */
    @Override
    public String getText() {
        return "!!!" + super.getText();
    }

}
