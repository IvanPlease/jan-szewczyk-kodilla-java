package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");
        //When
        String stevenPlatform = steven.sharePost();
        String johnPlatform = john.sharePost();
        String kodillaPlatform = kodilla.sharePost();
        //Then
        Assert.assertEquals("Sharing via Facebook", stevenPlatform);
        Assert.assertEquals("Sharing via Twitter", johnPlatform);
        Assert.assertEquals("Sharing via Snapchat", kodillaPlatform);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");
        //When
        steven.setSocialPublisher(new TwitterPublisher());
        john.setSocialPublisher(new SnapchatPublisher());
        kodilla.setSocialPublisher(new FacebookPublisher());
        String stevenPlatform = steven.sharePost();
        String johnPlatform = john.sharePost();
        String kodillaPlatform = kodilla.sharePost();
        //Then
        Assert.assertEquals("Sharing via Twitter", stevenPlatform);
        Assert.assertEquals("Sharing via Snapchat", johnPlatform);
        Assert.assertEquals("Sharing via Facebook", kodillaPlatform);
    }
}
