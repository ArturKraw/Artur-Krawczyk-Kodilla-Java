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
        System.out.println("\n" + "Mark [as representative of " + mark.getClass().getSimpleName() + " is actually " + markShouldPublish);
        String alexShouldPublish = alex.choose();
        System.out.println("Alex [as representative of " + alex.getClass().getSimpleName() + " is actually "  + alexShouldPublish);
        String susanShouldPublish = susan.choose();
        System.out.println("Susan [as representative of " + susan.getClass().getSimpleName() + " is actually "  + susanShouldPublish);

        //Then
        Assert.assertEquals(" FacebookPublisher] and interact through Facebook", markShouldPublish);
        Assert.assertEquals(" TwitterPublisher] and interact through Twitter", alexShouldPublish);
        Assert.assertEquals(" SnapchatPublisher] and interact through Snapchat", susanShouldPublish);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //given
        User mark = new Millenials("Mark Zuck");

        //When
        String markShouldPublish = mark.choose();
        System.out.println("\n" + "Mark [as representative of " + mark.getClass().getSimpleName() + " is actually " + markShouldPublish);
        mark.sharePost(new SnapchatPublisher());
        markShouldPublish = mark.choose();
        System.out.println("Mark [despite beeing a representative of " + mark.getClass().getSimpleName() + " is currently " + markShouldPublish);

        //Then
        Assert.assertEquals(" SnapchatPublisher] and interact through Snapchat", markShouldPublish);

                }

                }
