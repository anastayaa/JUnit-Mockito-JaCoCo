package junit.monprojet.test;

import junit.monprojet.BinString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinStringTest {

    private BinString binString;

    @Before
    public void setUp() throws Exception {
        binString = new BinString();
    }

    @Test
    public void sumFunctionTest() {
        int expected = 0;
        Assert.assertEquals(expected, binString.sum(""));
        expected = 100;
        Assert.assertEquals(expected, binString.sum("d"));
        expected = 265;
        Assert.assertEquals(expected, binString.sum("Add"));
    }

    @Test
    public void binariseFunctionTest() {
        String expected = "101";
        Assert.assertEquals(expected, binString.binarise(5));
        expected = "11111100";
        Assert.assertEquals(expected, binString.binarise(252));
    }

    @Test
    public void totalConversionTest() {
        String expected = "1000001";
        Assert.assertEquals(expected, binString.convert("A"));
    }
}
