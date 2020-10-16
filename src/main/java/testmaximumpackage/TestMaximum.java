package testmaximumpackage;


import static testmaximumpackage.FindMaximum.findMax;

public class TestMaximum {
    public static void main(String[] args) {
        FindMaximum findMaximumInt=new FindMaximum(12,13,14);
        FindMaximum findMaximumFloat=new FindMaximum(12f,13f,14f);
        FindMaximum findMaximumString=new FindMaximum("Apple","Peach","Banana");

        System.out.println("Welcome to test maximum program");
        System.out.println("Max of 3  Integer number is.. "+findMaximumInt.findMaxThroughClass());
        System.out.println("Max of 3 float number is.. "+findMaximumFloat.findMaxThroughClass());
        System.out.println("Max of 3 float number is.. "+findMaximumString.findMaxThroughClass());
        System.out.println("When more than 3 parameters are passed..with values 23,56,33,54,22,77,99,65");
        System.out.println("Max is.."+findMax(23,56,33,54,22,77,99,65));
    }



}