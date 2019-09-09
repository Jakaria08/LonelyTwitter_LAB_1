package com.example.lonelytwitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            NormalTweet firstTweet = new NormalTweet("hello world");
            ImportantTweet SecondTweet = new ImportantTweet("hello world!!");
            System.out.println(firstTweet.getTest()+"1 "+firstTweet.getDate());
            ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
            tweetList.add(firstTweet);
            tweetList.add(SecondTweet);
            System.out.println(tweetList.get(0).getTest()+"2 "+tweetList.get(0).getDate());
            System.out.println(tweetList.get(1).getTest()+"3 "+tweetList.get(1).getDate());
            System.out.println(tweetList.get(1).toString());

        }catch (TweetTooLongException ex){
            System.out.println("Too Long Tweet!");
        }

        try{
            NormalTweet thirdTweet = new NormalTweet("hello world hello world hello world " +
                    "hello world hello world hello world hello world hello world hello world " +
                    "hello world hello world hello world hello world hello world hello world " +
                    "hello world hello world hello world hello world hello world hello world ");

        }catch (TweetTooLongException ex){
            System.out.println("Too Long Tweet!");
        }
    }
}
