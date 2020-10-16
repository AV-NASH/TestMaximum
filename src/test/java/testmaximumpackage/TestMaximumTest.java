package testmaximumpackage;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void whenMaxIntAt_FirstPostion_ReturnMax() {
        Integer max, a=6,b=3,c=1;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        max=a;
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxIntAt_SecondPostion_ReturnMax() {
        Integer max,a=2,b=3,c=1;
        max=b;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxIntAt_ThirdPostion_ReturnMax() {
        Integer max, a=6,b=3,c=8;        max=c;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxFloatAt_FirstPostion_ReturnMax() {
        Float max, a=6f,b=3f,c=1f;
        max=a;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxFloatAt_SecondPostion_ReturnMax() {
        Float max,a=6f,b=9f,c=8f;
        max=b;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxFloatAt_ThirdPostion_ReturnMax() {
        Float max,a=6f,b=3f,c=8f;        max=c;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxStringAt_FirstPostion_ReturnMax() {
        String max, a="Peach",b="Apple",c="Banana";
        max=a;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxStringAt_SecondPostion_ReturnMax() {
        String max,a="Apple",b="Peach",c="Banana";
        max=b;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

    @Test
    public void whenMaxStringAt_ThirdPostion_ReturnMax() {
        String max,a="Apple",b="Banana",c="Peach";
        max=c;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Assert.assertEquals(max,findMaximum.findMaxThroughClass());
    }

}