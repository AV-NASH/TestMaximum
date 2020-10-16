package testmaximumpackage;


public class FindMaximum<E extends  Comparable> {
      private  E value1,value2,value3;

        public FindMaximum(E value1,E value2, E value3) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }

        public E findMaxThroughClass(){

            return findMax(value1,value2,value3);
        }

    public static  <E extends  Comparable> E findMax(E number1, E number2, E number3) {
        E max=number1;
        if(max.compareTo(number2)<0) max=number2;
        if(max.compareTo(number3)<0) max=number3;

        return max;
    }

    }


