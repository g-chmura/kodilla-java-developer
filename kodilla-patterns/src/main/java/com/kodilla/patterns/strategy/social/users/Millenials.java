package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public final class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
