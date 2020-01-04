package com.jacoco;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SommeArgentTest {

    private SommeArgent m12MAD, m14MAD, m14USD;
    private static int i = 0;

    @Before
    public void setUp() {
        i++;
        m12MAD = new SommeArgent(12, "MAD");
        m14MAD = new SommeArgent(14, "MAD");
        m14USD = new SommeArgent(14, "USD");
        System.out.println(i + "ime passage avant exécution d'une méthode de test");
    }

    @Test
    public void sommeArgentTest() throws UniteDistincteException {
        SommeArgent expected = new SommeArgent(26, "MAD");
        SommeArgent result = m12MAD.add(m14MAD);

        Assert.assertTrue(expected.equals(result));
    }

    @Test(expected = UniteDistincteException.class)
    public void sommeArgentUniteDistincteExceptionTest() throws UniteDistincteException{
        m14MAD.add(m14USD);
    }

    @Test
    public void equalsTest() {
        Assert.assertTrue(!m12MAD.equals(null));
        Assert.assertEquals(m12MAD, m12MAD);
        Assert.assertEquals(m12MAD, new SommeArgent(12, "MAD")); // (1)
        Assert.assertTrue(!m12MAD.equals(m14MAD));
        Assert.assertTrue(!m14USD.equals(m14MAD));
    }



    @After
    public void tearDown() {
        m12MAD = null;
        m14MAD = null;
        m14USD = null;
        System.out.println(i + "ime passage aprés exécution d'une méthode de test");
    }
}
