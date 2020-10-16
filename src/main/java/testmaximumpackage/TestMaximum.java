package testmaximumpackage;


public class TestMaximum {
    public static void main(String[] args) {
        FindMaximum findMaximumInt=new FindMaximum(12,13,14);
        FindMaximum findMaximumFloat=new FindMaximum(12f,13f,14f);
        FindMaximum findMaximumString=new FindMaximum("Apple","Peach","Banana");

        System.out.println("Welcome to test maximum program");
        System.out.println("Max of 3  Integer number is.. "+findMaximumInt.findMaxThroughClass());
        System.out.println("Max of 3 float number is.. "+findMaximumFloat.findMaxThroughClass());
        System.out.println("Max of 3 float number is.. "+findMaximumString.findMaxThroughClass());
    }



}