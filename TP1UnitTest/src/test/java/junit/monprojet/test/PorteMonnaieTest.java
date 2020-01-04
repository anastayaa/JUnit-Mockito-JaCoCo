package junit.monprojet.test;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PorteMonnaieTest {

    PorteMonnaie porteMonnaieMAD1, porteMonnaieMAD2;
    SommeArgent m5MAD1, m5MAD2, m10MAD;

    @Before
    public void setUp() throws Exception {
        porteMonnaieMAD1 = new PorteMonnaie();
        porteMonnaieMAD2 = new PorteMonnaie();

        m5MAD1 = new SommeArgent(5, "MAD");
        m5MAD2 = new SommeArgent(5, "MAD");
        m10MAD = new SommeArgent(10, "MAD");
    }

    @Test
    public void equalsTest() {
        porteMonnaieMAD1.ajouteSomme(m5MAD1);
        porteMonnaieMAD2.ajouteSomme(m5MAD2);

        Assert.assertTrue(porteMonnaieMAD1.equals(porteMonnaieMAD2));
    }

    @Test
    public void ajouteSommeTest() {
        porteMonnaieMAD1.ajouteSomme(m5MAD1);
        porteMonnaieMAD1.ajouteSomme(m5MAD2);

        porteMonnaieMAD2.ajouteSomme(m10MAD);

        Assert.assertTrue(porteMonnaieMAD1.equals(porteMonnaieMAD2));
    }
}
