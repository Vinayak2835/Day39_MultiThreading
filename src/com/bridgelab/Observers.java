package com.bridgelab;

import com.bridgelab.News.NewsType;

public interface Observers {
    void onUpdate(News data);

    NewsType getNewsType();

	//NewsType getNewsType();
}