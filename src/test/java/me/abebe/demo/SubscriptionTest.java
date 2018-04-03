package me.abebe.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class SubscriptionTest {
   /* @Test
    public void pricePerMonth() throws Exception {
    }

    @Test
    public void cancel() throws Exception {
    }*/

    @Test
    public void test_returnDollar() {
        System.out.println("Test if pricePerMonth returns Dollars...") ;
        Subscription S = new Subscription(200,2) ;
        assertTrue(S.pricePerMonth() == 1.0) ;
    }

    @Test
    public void test_roundUp() {
        System.out.println("Test if pricePerMonth rounds up correctly...") ;
        Subscription S = new Subscription(200,3) ;
        assertTrue(S.pricePerMonth() == 0.67) ;
    }

}