package com.bridgelabz.Collections.SortedSetInterface;

import com.bridgelabz.Collections.AllUpperCase;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Tree Set: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Tree Set: ");
        for (int i=0 ; i<num ; i++){
            treeSet.add(in.next());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.print("Enter the Element you want remove from the Tree Set: ");
        String element1 = in.next();

        boolean isRemoved = treeSet.remove(element1);
        if (isRemoved)
            System.out.println("'"+element1+"' removed!!!");
        else
            System.out.println("'"+element1+"' is not found in the Tree Set");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.print("Enter an element to check if the Tree Set contains it: ");
        String element2 = in.next();

        boolean status = treeSet.contains(element2);
        if (status)
            System.out.println("The Tree Set Contains the specified Element "+element2);
        else
            System.out.println("The Tree Set does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.println("=> Displaying the Tree Code Value for this Collection... "+treeSet.hashCode());

        System.out.println("=> Checking if the Tree Set is Empty..."+treeSet.isEmpty());

        System.out.println("=> Displaying the size of the Tree Set..."+treeSet.size());

        System.out.println("=> Displaying the Elements of the Tree Set using iterator... ");
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.println("=> Displaying the square values for all the values in the Tree Set: ");
        AllUpperCase allUpperCase = (String x) -> x.toUpperCase();
        for (String string : treeSet)
            System.out.print(allUpperCase.calculate(string)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.println("=> Displaying the Elements of the Tree Set using Consumer Functional Interface: ");
        Consumer<String> consumer = value -> System.out.print(value+" ");
        treeSet.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Tree Set starts with 'S' using Predicate Functional Interface: ");
        Predicate<String> predicate = value -> (value.startsWith("S"));
        for (String string : treeSet)
            System.out.print(predicate.test(string)+" ");

        System.out.println("\n=> Incrementing all the elements in the Tree Set by 5 values using Function Functional Interface: ");
        Function<String,String> function = value -> (value+5);
        for (String string : treeSet)
            System.out.print(function.apply(string)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Tree Set: "+treeSet+"\n");

        System.out.println("=> Displaying each element in the Tree Set in UPPERCASE using 'map' and 'collect': ");
        List<String> squareValues = treeSet.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all elements in the Tree Set that starts with 'T' using 'filter' and 'reduce': ");
        String sumOfEvenElements = treeSet.stream().filter(x -> (x.startsWith("T"))).reduce(" ",(String,s) -> String.concat(s));
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Tree Set using 'sorted' and 'forEach': ");
        treeSet.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
