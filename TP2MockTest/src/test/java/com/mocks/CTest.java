package com.mocks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

@RunWith(MockitoJUnitRunner.class)
@PrepareForTest(C.class)
public class CTest {

    @Spy
    private C c=new C();

    @Test
    public void methodem1Test(){
        PowerMockito.mockStatic(C.class);
        Mockito.when(C.m1()).thenReturn(42);
        Assert.assertEquals(42, c.m1());
    }

    @Test
    public void methodem2Test(){
        Mockito.when(c.m2(2)).thenReturn(4);
        Assert.assertEquals(4, c.m2(2));
    }
}

