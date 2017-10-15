package com.ericsson.java8.lambda.DoubleNumericArrayFunc;

public class ExceptionTest {
    public static void main(String[] args) throws EmptyArrayException {
        DoubleNumericArrayFunc doubleNumericArrayFunc;
        double[] values = new double[]{};
        doubleNumericArrayFunc=(value)->{
            if(value.length==0){
                throw new EmptyArrayException("empty Array");
            }
            double sum=0;
            for (int i = 0; i < value.length; i++) {
                sum+=value[i];
            }
            return sum/value.length;
        };

        try {
            System.out.println(doubleNumericArrayFunc.average(values));
        } catch (EmptyArrayException e) {
            throw new EmptyArrayException("empty");
        }


    }
}
