package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        final User millennials = new Millenials("Sophia");
        final User yGeneration = new YGeneration("Nelly");
        final User zGeneration = new ZGeneration("John");


        final String millennialsMedia = millennials.sharePost();
        final String yGenerationMedia = yGeneration.sharePost();
        final String zGenerationMedia = zGeneration.sharePost();

        System.out.println("\nDefault sharing Strategies:");
        System.out.println(millennials.getName() + " " + millennialsMedia);
        System.out.println(yGeneration.getName() + " " + yGenerationMedia);
        System.out.println(zGeneration.getName() + " " + zGenerationMedia);


        assertEquals("Sophia publishes by Facebook", millennials.getName() + " " + millennialsMedia);
        assertEquals("Nelly publishes by Twitter", yGeneration.getName() + " " + yGenerationMedia);
        assertEquals("John publishes by Snapchat", zGeneration.getName() + " " + zGenerationMedia);
    }


    @Test
    public void testIndividualSharingStrategy() {

        final User millennials = new Millenials("Sophia");
        final User yGeneration = new YGeneration("Nelly");
        final User zGeneration = new ZGeneration("John");


        millennials.setSocialPublisher(new TwitterPublisher());
        yGeneration.setSocialPublisher(new SnapchatPublisher());
        zGeneration.setSocialPublisher(new FacebookPublisher());

        final String mShare = millennials.sharePost();
        final String yShare = yGeneration.sharePost();
        final String zShare = zGeneration.sharePost();

        System.out.println("\nIndividual sharing strategies:");
        System.out.println(millennials.getName() + " " + mShare);
        System.out.println(yGeneration.getName() + " " + yShare);
        System.out.println(zGeneration.getName() + " " + zShare);


        assertEquals("Sophia publishes by Twitter", millennials.getName() + " " + mShare);
        assertEquals("Nelly publishes by Snapchat", yGeneration.getName() + " " + yShare);
        assertEquals("John publishes by Facebook", zGeneration.getName() + " " + zShare);
    }
}
