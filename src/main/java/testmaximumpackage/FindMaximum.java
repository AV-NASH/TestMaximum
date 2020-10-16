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

    public static  <E extends  Comparable> E findMax(E...value) {
            E max = null;
        if(value.length==0) System.out.println("No values to find maximum of");
        else{
            max=value[0];
            for(int index=1;index<value.length;index++) {
                if (max.compareTo(value[index]) < 0) max = value[index];
            }
        }
        printMax(max);
        return max;

    }
    public static <E extends  Comparable> void printMax(E max) {
        System.out.println("Max value is.."+ max);
    }

    }


