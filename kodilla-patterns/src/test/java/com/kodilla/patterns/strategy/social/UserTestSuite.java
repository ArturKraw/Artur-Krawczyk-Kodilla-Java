package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User mark = new Millenials("Mark Zuck");
        User alex = new YGeneration("Alex Newton");
        User susan = new ZGeneration("Susan Maxim");

        //When
        String markShouldPublish = mark.choose();
        System.out.println("\n" + "Mark as: " + markShouldPublish);
        String alexShouldPublish = alex.choose();
        System.out.println("Alex as: " + alexShouldPublish);
        String susanShouldPublish = susan.choose();
        System.out.println("Susan as: " + susanShouldPublish);

        //Then
        Assert.assertEquals("[Millenials] share on Facebook", markShouldPublish);
        Assert.assertEquals("[YGeneration] share on Twitter", alexShouldPublish);
        Assert.assertEquals("[ZGeneration] share on Snapchat", susanShouldPublish);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //given
        User mark = new Millenials("Mark Zuck");

        //When
        String markShouldPublish = mark.choose();
        System.out.println("\n" + "Mark as: " + markShouldPublish);
        mark.sharePost(new SnapchatPublisher());
        markShouldPublish = mark.choose();
        System.out.println("Mark act now as:" + markShouldPublish);

        //Then
        Assert.assertEquals("[ZGeneration] share on Snapchat", markShouldPublish);

    }

}
