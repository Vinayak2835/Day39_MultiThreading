package com.bridgelab;

import com.bridgelab.News.NewsType;

public class AssamAajTak implements Observers {

    public void onUpdate(News news) {
        System.out.println("News Received by Assam : " + news.news);
    }

    public NewsType getNewsType() {
        return NewsType.ASSAM;
    }
}