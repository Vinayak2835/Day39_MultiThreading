package com.bridgelab;

import com.bridgelab.News.NewsType;

public class MumbaiAajTak implements Observers {
    
	public void onUpdate(News news) {
        System.out.println("News Received by Mumbai : " + news.news);
    }

    public NewsType getNewsType() {
        return NewsType.MUMBAI;
    }
 }
