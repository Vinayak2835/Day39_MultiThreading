package com.bridgelab;

import com.bridgelab.News.NewsType;

public class DelhiAajTak implements Observers {

    
    public void onUpdate(News news) {
        System.out.println("News Received by Delhi : " + news.news);
    }

    public News.NewsType getNewsType() {
        return NewsType.DELHI;
    }
}

