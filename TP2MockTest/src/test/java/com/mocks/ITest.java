package com.mocks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

public class ITest {

    @Mock
    private I i;

    @Before
    public void doBeforeEachTestCase() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void methodeIntAssertTest() throws Exception {
        Mockito.when(i.methodeInt()).thenReturn(0);
        Assert.assertEquals(i.methodeInt(), 0);
    }

    @Test
    public void methodeIntTimesTest() throws Exception {
        Mockito.when(i.methodeInt()).thenReturn(1, 2, 3, 4);
        for (int j = 0; j < 4; j++) {
            i.methodeInt();
        }
        Mockito.verify(i, Mockito.times(4)).methodeInt();
        Assert.assertEquals(i.methodeInt(), 4);
    }

    @Test(expected = Exception.class)
    public void methodeIntExceptionTest() throws Exception {
        Mockito.doThrow(new Exception()).when(i.methodeInt());
        i.methodeInt();
    }

    @Test(expected = Exception.class)
    public void methodeVoidExceptionTest() throws Exception {
        Mockito.doThrow(new Exception()).when(i).methodeVoid();
        i.methodeVoid();
    }

    @Test
    public void methodeParamTest() {
        Mockito.when(i.methodeParam(3)).thenReturn(3);
        Mockito.when(i.methodeParam(5)).thenReturn(10);
        Mockito.doReturn(1).when(i).methodeParam(0);
        Mockito.doReturn(3).when(i).methodeParam(3);
        Mockito.doReturn(5).when(i).methodeParam(10);
    }

    @Test
    public void methodeParamMatchersTest() {
        Mockito.when(i.methodeParam(AdditionalMatchers.gt(10))).thenReturn(42);
        Mockito.when(i.methodeParam(AdditionalMatchers.leq(10))).thenReturn(0);

        Assert.assertEquals(42, i.methodeParam(11));
        Assert.assertEquals(0, i.methodeParam(9));
    }

    @Test
    public void methodeParamArrayListTest() {
        Mockito.verify(i).methodeParamArrayList(new ArrayList<String>());
        Mockito.argThat(new ListMatcher());
    }
}
