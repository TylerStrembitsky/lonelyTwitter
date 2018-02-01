package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author tylerstrembitsky
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet extends Object implements Tweetable {
    private String text;
    protected Date date;

    /**
     * Creates a tweet
     *
     * @param tweet is the tweet message
     * @param date is the tweet date
     * @throws TweetTooLongException throws exception if tweet too long
     */
    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setText(tweet);
        this.date = date;
    }

    /**
     * Updates date
     *
     * @param tweet
     * @throws TweetTooLongException
     */
    public Tweet(String tweet) throws TweetTooLongException {
        this.setText(tweet);
        this.date = new Date();
    }

    /**
     * Gets text of string
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text of the tweet
     *
     * @param text sets tweet text
     * @throws TweetTooLongException thrown if tweet is too long
     */
    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets date of the tweet
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date of tweet
     *
     * @param date sets tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Chceck if tweet is important
     *
     * @return
     */
    public abstract Boolean isImportant();

}
