package com.jacoco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CounterTest {

    Counter counter1, counter2;

    @Before
    public void setUp() {
        counter1 = new Counter();
        counter1.setCount(2);
        counter2 = new Counter(1);
    }

    @Test
    public void incrementTest() {
        int expected = 3;
        counter1.increment();
        int result = counter1.getCount();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void decrementTest() {
        int expected = 1;
        counter1.decrement();
        int result = counter1.getCount();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addTest() {
        int expected = 3;
        Counter counter = counter1.add(counter2);
        int result = counter.getCount();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void subTest() {
        int expected = 1;
        Counter counter = counter1.sub(counter2);
        int result = counter.getCount();
        Assert.assertEquals(expected, result);
    }
}
