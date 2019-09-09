package com.example.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet {
    public NormalTweet(String test, Date date) throws TweetTooLongException {
        super(test, date);
    }

    public NormalTweet(String test) throws TweetTooLongException {
        super(test);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
