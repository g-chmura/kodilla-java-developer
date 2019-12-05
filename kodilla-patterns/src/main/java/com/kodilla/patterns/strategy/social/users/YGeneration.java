package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;

public final class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
