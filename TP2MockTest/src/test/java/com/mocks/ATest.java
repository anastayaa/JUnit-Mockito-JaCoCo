package com.mocks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATest {

    @Spy
    private A a=new A();

    @Test
    public void methodesm1m2Test(){
        a.m1();
        a.m2(2);

        Mockito.verify(a, Mockito.times(1)).m1();
        Mockito.verify(a, Mockito.times(1)).m2(2);
    }

    @Test
    public void methodem2Test(){
        Mockito.when(a.m2(42)).thenReturn(0);
        a.m2(1);
        a.m2(42);
        a.m2(5);

        Assert.assertEquals(a.m2(42), 0);
    }

}

