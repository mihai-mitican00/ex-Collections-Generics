package com.endava.tmd;

import java.util.*;

public class FirstExercise {

    public static void main(String[] args) {
        //Making a list and populating with numbers from 1 to 10
        List<Integer> lista = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            lista.add(i);
        }

        //printing only even numbers
        for (Integer integer : lista) {
            if(integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println("\n");
        //Making a set and populating it with same three strings and iterate trough it.


        Set<String> set = new HashSet<>();
        set.add("Mihai");
        set.add("Mihai");
        set.add("Mihai");

        // We can see that the set added the element just once because it keeps unique elements.
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();


        //Making a map with String keys and Integer values and populate it
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("five", 5);
        map.put("ten", 10);
        map.put("fifteen", 15);
        map.put("twenty", 20);

        //print the keys with a value higher than 10
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 10){
                System.out.println(entry.getKey());
            }
        }

    }
}
