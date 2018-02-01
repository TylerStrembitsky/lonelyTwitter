package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet interface.
 *
 * @author tylerstrembitsky
 */
public interface Tweetable {

    /**
     * Gets text of tweet
     *
     * @return
     */
    public String getText();

    /**
     * Gets date of tweet
     *
     * @return
     */
    public Date getDate();
}
