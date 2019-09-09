package com.example.lonelytwitter;

import java.util.Date;

public abstract class Tweet extends Object implements Tweetable{
    private String test;
    protected Date date;

    public Tweet(String test, Date date) throws TweetTooLongException {
        this.setTest(test);
        this.date = date;
    }

    public Tweet(String test) throws TweetTooLongException {
        this.setTest(test);
        this.date = new Date();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) throws TweetTooLongException {
        if (test.length() <= 140) {
            this.test = test;
        }else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return test+" "+date;
    }

    public abstract Boolean isImportant();
}
