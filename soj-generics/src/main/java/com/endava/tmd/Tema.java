package com.endava.tmd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tema {
    public static void main(String[] args) {

        //---------------PRIMUL EXERCITIU-----------
        Integer [] intArr = {1,2,3,4};
        String [] stringArr = {"unu", "doi", "trei", "patru"};

        System.out.println("Print int arr before");
        printArr(intArr);
        System.out.println("Print int arr after");
        swap(intArr,1,4);
        printArr(intArr);

        System.out.println("Print string arr after");
        swap(stringArr, 1, 4);
        printArr(stringArr);

        //-------------AL DOILEA EXERCITIU-----------------

        //String should not be accepted by method
        List <String> stringList = new ArrayList<>(List.of("unu ", "doi", "trei"));
        //System.out.println("count of prime numbers: "+countPrimeNumbers(stringList));

        List<Integer> intList = new ArrayList<>(List.of(1,3,2,7,12,13));
        List<Double> doubleList = new ArrayList<>(List.of(1d, 1.2d, 3d, 3.2d, 2d, 2.13d, 13d, 7d));
        List<Long> longList = new ArrayList<>(List.of(1l,3l,2l,7l,12l,13l));

        System.out.println(intList+ "\ncount of prime numbers: "+countPrimeNumbers(intList));
        System.out.println(doubleList+ "\ncount of prime numbers: "+countPrimeNumbers(doubleList));
        System.out.println(longList+ "\ncount of prime numbers: "+countPrimeNumbers(longList));
    }

    static <T> void swap(T[] array, int firstPos, int secondPos){
        try{
            T aux = array[firstPos-1];
            array[firstPos-1] = array[secondPos-1];
            array[secondPos-1] = aux;
        }catch (IndexOutOfBoundsException ex){
            ex.getMessage();
            System.out.println("The index should be: 1 <= index <= array length");
        }
    }

    static <T extends Number> boolean auxIsPrime(T number){
        if(number.doubleValue() <= 1){
            return false;
        }
        for(int i = 2; i < number.doubleValue(); i++){
            if(number.doubleValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    static <T extends Number> int countPrimeNumbers(List<T> list){
        if(list.isEmpty()){
            return 0;
        }
        int count = 0;
        for(T element : list){
            if(auxIsPrime(element)){
                count++;
            }
        }

        return count;
    }

    static <T> void printArr(T[] array){
        Arrays.stream(array).forEach(x -> System.out.print(x+" "));
        System.out.println();
    }
}
