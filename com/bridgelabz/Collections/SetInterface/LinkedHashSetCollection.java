package com.bridgelabz.Collections.SetInterface;

import com.bridgelabz.Collections.AllUpperCase;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class LinkedHashSetCollection {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Linked Hash Set: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Linked Hash Set: ");
        for (int i=0 ; i<num ; i++){
            linkedHashSet.add(in.next());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked Hash Set: "+linkedHashSet+"\n");

        System.out.print("Enter the Element you want remove from the Linked Hash Set: ");
        String element1 = in.next();

        boolean isRemoved = linkedHashSet.remove(element1);
        if (isRemoved)
            System.out.println("'"+element1+"' removed!!!");
        else
            System.out.println("'"+element1+"' is not found in the Linked Hash Set");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked Hash Set: "+linkedHashSet+"\n");

        System.out.print("Enter an element to check if the Linked Hash Set contains it: ");
        String element2 = in.next();

        boolean status = linkedHashSet.contains(element2);
        if (status)
            System.out.println("The Linked Hash Set Contains the specified Element "+element2);
        else
            System.out.println("The Linked Hash Set does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked Hash Set: "+linkedHashSet+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+linkedHashSet.hashCode());

        System.out.println("=> Checking if the Linked Hash Set is Empty..."+linkedHashSet.isEmpty());

        System.out.println("=> Displaying the size of the Linked Hash Set..."+linkedHashSet.size());

        System.out.println("=> Displaying the Elements of the Linked Hash Set using iterator... ");
        Iterator<String> itr = linkedHashSet.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked Hash Set: "+linkedHashSet+"\n");

        System.out.println("=> Displaying the square values for all the values in the Linked Hash Set: ");
        AllUpperCase allUpperCase = (String x) -> x.toUpperCase();
        for (String string : linkedHashSet)
            System.out.print(allUpperCase.calculate(string)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Hash Set: "+linkedHashSet+"\n");

        System.out.println("=> Displaying the Elements of the Linked Hash Set using Consumer Functional Interface: ");
        Consumer<String> consumer = value -> System.out.print(value+" ");
        linkedHashSet.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Linked Hash Set starts with 'S' using Predicate Functional Interface: ");
        Predicate<String> predicate = value -> (value.startsWith("S"));
        for (String string : linkedHashSet)
            System.out.print(predicate.test(string)+" ");

        System.out.println("\n=> Incrementing all the elements in the Linked Hash Set by 5 values using Function Functional Interface: ");
        Function<String,String> function = value -> (value+5);
        for (String string : linkedHashSet)
            System.out.print(function.apply(string)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked Hash Set: "+linkedHashSet+"\n");

        System.out.println("=> Displaying each element in the Linked Hash Set in UPPERCASE using 'map' and 'collect': ");
        List<String> squareValues = linkedHashSet.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all elements in the Linked Hash Set that starts with 'T' using 'filter' and 'reduce': ");
        String sumOfEvenElements = linkedHashSet.stream().filter(x -> (x.startsWith("T"))).reduce(" ",(String,s) -> String.concat(s));
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Linked Hash Set using 'sorted' and 'forEach': ");
        linkedHashSet.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
