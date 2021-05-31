package com.bridgelab;

import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {
    List<Observers> observersList = new ArrayList<>();
    
    public void register(Observers observer) {
        observersList.add(observer);
    }

    public void unRegister(Observers observer) {
          observersList.remove(observer);
    }

    public void update(News news) {

       for (Observers observer : observersList)
            if (observer.getNewsType() == news.newsType) {
                observer.onUpdate(news);
            }
    }
}
