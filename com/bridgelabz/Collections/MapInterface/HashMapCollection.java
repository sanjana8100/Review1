package com.bridgelabz.Collections.MapInterface;

import com.bridgelabz.Collections.AllUpperCase;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Hash Map: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Hash Map: ");
        for (int i=0 ; i<num ; i++){
            hashMap.put(in.next(),1);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.print("Enter the Element you want remove from the Hash Map: ");
        String element1 = in.next();

        Integer isRemoved = hashMap.remove(element1);
        if (isRemoved != null)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Hash Map");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.print("Enter an element to check if the Hash Map contains it: ");
        String element2 = in.next();

        boolean status = hashMap.containsKey(element2);
        if (status)
            System.out.println("The Hash Map Contains the specified Element "+element2);
        else
            System.out.println("The Hash Map does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+hashMap.hashCode());

        System.out.println("=> Checking if the Hash Map is Empty..."+hashMap.isEmpty());

        System.out.println("=> Displaying the size of the Hash Map..."+hashMap.size());

        System.out.println("=> Displaying the Elements of the Hash Map using iterator... ");
        Iterator<String> itr = hashMap.keySet().iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.println("=> Displaying the square values for all the values in the Hash Map: ");
        AllUpperCase allUpperCase = (String x) -> x.toUpperCase();
        for (String string : hashMap.keySet())
            System.out.print(allUpperCase.calculate(string)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.println("=> Displaying the Elements of the Hash Map using Consumer Functional Interface: ");
        Consumer<String> consumer = value -> System.out.print(value+" ");
        hashMap.keySet().forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Hash Map starts with 'S' using Predicate Functional Interface: ");
        Predicate<String> predicate = value -> (value.startsWith("S"));
        for (String string : hashMap.keySet())
            System.out.print(predicate.test(string)+" ");

        System.out.println("\n=> Incrementing all the elements in the Hash Map by 5 values using Function Functional Interface: ");
        Function<String,String> function = value -> (value+5);
        for (String string : hashMap.keySet())
            System.out.print(function.apply(string)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Map: "+hashMap+"\n");

        System.out.println("=> Displaying each element in the Hash Map in lowercase using 'map' and 'collect': ");
        List<String> squareValues = hashMap.keySet().stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all elements in the Hash Map that starts with 'T' using 'filter' and 'reduce': ");
        String sumOfEvenElements = hashMap.keySet().stream().filter(x -> (x.startsWith("T"))).reduce(" ",(String,s) -> String.concat(s));
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Hash Map using 'sorted' and 'forEach': ");
        hashMap.keySet().stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
