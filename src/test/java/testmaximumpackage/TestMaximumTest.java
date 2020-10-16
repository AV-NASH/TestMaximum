package testmaximumpackage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMaximumTest {
    @Test
    public void whenMaxIntAt_FirstPostion_ReturnMax() {
        TestMaximum testMaximum=new TestMaximum();
        Integer max, a=6,b=3,c=1;
        max=a;
        Assert.assertEquals(max,testMaximum.findMax(a,b,c));
    }

    @Test
    public void whenMaxIntAt_SecondPostion_ReturnMax() {
        TestMaximum testMaximum=new TestMaximum();
        Integer max,a=2,b=3,c=1;
        max=b;
        Assert.assertEquals(max,testMaximum.findMax(a,b,c));
    }

    @Test
    public void whenMaxIntAt_ThirdPostion_ReturnMax() {
        TestMaximum testMaximum=new TestMaximum();
        Integer max, a=6,b=3,c=8;        max=c;
        Assert.assertEquals(max,testMaximum.findMax(a,b,c));
    }

}