package com.example.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {
    public ImportantTweet(String test, Date date) throws TweetTooLongException {
        super(test, date);
    }

    public ImportantTweet(String test) throws TweetTooLongException {
        super(test);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
