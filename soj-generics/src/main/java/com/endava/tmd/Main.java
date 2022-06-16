package com.endava.tmd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [] intArray = {8, 11, 4, 9};
        Character [] charArray = {'o', 'u', 'p' , 'n'};
        Double [] doubleArray = {1.5, 3.4, 1.1, 8.9};

        System.out.println("----CLASSIC THREE METHODS----");
        printArrayInteger(intArray);
        printArrayCharacter(charArray);
        printArrayDouble(doubleArray);

        System.out.println("----GENERICS ONE METHOD----");
        printArrayAll(intArray);
        printArrayAll(charArray);
        printArrayAll(doubleArray);
    }

    static void printArrayInteger(Integer [] intArray){
        Arrays.stream(intArray).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    static void printArrayCharacter(Character [] intArray){
        Arrays.stream(intArray).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    static void printArrayDouble(Double [] intArray){
        Arrays.stream(intArray).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    static <T> void printArrayAll(T [] arr){

        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();



        /*
        for(T element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
         */
    }


}