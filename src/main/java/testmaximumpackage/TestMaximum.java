package testmaximumpackage;

public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to test maximum program");
        TestMaximum testMaximum=new TestMaximum();
        System.out.println("Max of 3  Integer number is.. "+testMaximum.findMax(12,45,67));
        System.out.println("Max of 3 float number is.. "+testMaximum.findMax(12f,45f,67f));
    }
    public  Integer findMax(Integer number1, Integer number2, Integer number3) {
        Integer max=number1;
        if(max.compareTo(number2)<0) max=number2;
        if(max.compareTo(number3)<0) max=number3;

        return max;
    }

    public  Float findMax(Float number1, Float number2, Float number3) {
        Float max=number1;
        if(max.compareTo(number2)<0) max=number2;
        if(max.compareTo(number3)<0) max=number3;
        return max;
    }
}