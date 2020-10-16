package testmaximumpackage;

public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to test maximum program");
        TestMaximum testMaximum=new TestMaximum();
        System.out.println("Max of 3 number is.. "+testMaximum.findMax(12,45,67));
    }
    public  Integer findMax(Integer number1, Integer number2, Integer number3) {
        Integer max=number1;
        if(max.compareTo(number2)<0) max=number2;
        if(max.compareTo(number3)<0) max=number3;

        return max;
    }
}