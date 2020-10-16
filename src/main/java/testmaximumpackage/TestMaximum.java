package testmaximumpackage;


import static testmaximumpackage.FindMaximum.findMax;

public class TestMaximum {
    public static void main(String[] args) {
        FindMaximum findMaximumInt=new FindMaximum(12,13,14);
        FindMaximum findMaximumFloat=new FindMaximum(12f,13f,14f);
        FindMaximum findMaximumString=new FindMaximum("Apple","Peach","Banana");

        System.out.println("Welcome to test maximum program");
        findMaximumInt.findMaxThroughClass();
        findMaximumFloat.findMaxThroughClass();
        findMaximumString.findMaxThroughClass();
        System.out.println("When more than 3 parameters are passed..with values 23,56,33,54,22,77,99,65");
        findMax(23,56,33,54,22,77,99,65);
    }



}