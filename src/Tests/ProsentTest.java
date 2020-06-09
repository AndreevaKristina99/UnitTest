package Tests;

import model.Prosent;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;

public class ProsentTest {
Prosent p1=new Prosent();
Prosent p2=new Prosent();

    @Test
    public void getProcent() {
    }
    @BeforeMethod
    public void setUp() throws Exception {
        this.p2.setNumber(3);
        this.p2.setKoef(10.0D);
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetPercent() throws Exception {
        Assert.assertEquals(this.p1.getcountPr(), 2.02D, 0.001D);
    }

    @Test
    public void testGetPercent2() throws Exception {
        Assert.assertEquals(this.p2.getcountPr(), 3.3D, 0.001D);
    }
}