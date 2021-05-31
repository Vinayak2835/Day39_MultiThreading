package com.bridgelab;

import com.bridgelab.News.NewsType;

public class MainClass {

    public static void main(String[] args) {

         News assamNews = new News();
        assamNews.news = "Hii Heavy Raining in Assam";
        assamNews.newsType = NewsType.ASSAM;

        News mumbaiNews = new News();
        mumbaiNews.news = "Hii Heavy Raining in Mumbai";
        mumbaiNews.newsType = NewsType.MUMBAI;

        News delhiNews = new News();
        delhiNews.news = "Hii Heavy Raining in Delhi";
        delhiNews.newsType = NewsType.DELHI;

        AssamAajTak assamObserver = new AssamAajTak();
        MumbaiAajTak bizObserver = new MumbaiAajTak();
        DelhiAajTak delhiObserver = new DelhiAajTak();
        CentralAajTak subject = new CentralAajTak();

        subject.register(assamObserver);
        subject.register(bizObserver);
        subject.register(delhiObserver);

        System.out.println("\nAfter registered!");
        subject.update(assamNews);
        subject.update(mumbaiNews);
        subject.update(delhiNews);
       
        subject.unRegister(delhiObserver);

        System.out.println("\nAfter unregistered!");
        subject.update(delhiNews);
        subject.update(assamNews);
        subject.update(mumbaiNews);
        
    }
}
