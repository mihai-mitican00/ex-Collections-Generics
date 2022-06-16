package com.endava.tmd;

import java.util.*;

public class SecondExercise {
    public static void main(String[] args) {
        //creating list of integers and adding numbers to it
        List<Integer> lista = new ArrayList<>(List.of(7, 4, 5, 2, 1, 2, 4, 1));
        System.out.print("Lista initiala:");
        lista.forEach(i -> System.out.print(i + " "));

        //Eliminate duplicates using Set
        Set<Integer> noDuplicates = new LinkedHashSet<>(lista);
        lista.clear();
        lista.addAll(noDuplicates);
        System.out.print("\nLista fara duplicate:");
        lista.forEach(i -> System.out.print(i + " "));

        //Sort the numbers in descending order
        System.out.print("\nLista sortata crescator:");
        Collections.sort(lista);
        lista.forEach(i -> System.out.print(i + " "));
        System.out.print("\nLista sortata descrescator:");
        Collections.sort(lista, Collections.reverseOrder());
        lista.forEach(i -> System.out.print(i + " "));

        //creating a Set of Strings from the previous form of the used List (we convert ints to Strings).
        Set<String> set = new LinkedHashSet<>();
        for (Integer i : lista) {
            set.add(String.valueOf(i));
        }

        //print the set
        System.out.print("\nSet din elementele listei ca si Stringuri:");
        set.forEach(s -> System.out.print(s + " "));


        //creating Map with keys as set values and map values as list values
        Map<String, Integer> map = new LinkedHashMap<>();

        Iterator itrList = lista.iterator();
        Iterator itrSet = set.iterator();

        while (itrSet.hasNext()) {
            map.put((String) itrSet.next(), (Integer) itrList.next());
        }


        //printing map
        System.out.println("\nMap cu String keys si Integer values");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + "  " + "value: " + entry.getValue());
        }

    }
}
