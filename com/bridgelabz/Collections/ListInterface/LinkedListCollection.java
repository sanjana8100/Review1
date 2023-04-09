package com.bridgelabz.Collections.ListInterface;

import com.bridgelabz.Collections.Square;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Linked List: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Linked List: ");
        for (int i=0 ; i<num ; i++){
            linkedList.add(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked List: "+linkedList+"\n");

        System.out.print("Enter the Element you want remove from the Linked List: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = linkedList.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Linked List");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked List: "+linkedList+"\n");

        System.out.print("Enter an element to check if the Linked List contains it: ");
        Integer element2 = in.nextInt();

        boolean status = linkedList.contains(element2);
        if (status)
            System.out.println("The Linked List Contains the specified Element "+element2);
        else
            System.out.println("The Linked List does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked List: "+linkedList+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+linkedList.hashCode());

        System.out.println("=> Checking if the Linked List is Empty..."+linkedList.isEmpty());

        System.out.println("=> Displaying the size of the Linked List..."+linkedList.size());

        System.out.println("=> Displaying the Elements of the Linked List using iterator... ");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+linkedList+"\n");

        System.out.println("=> Displaying the square values for all the values in the Linked List: ");
        Square square = (int x) -> x*x;
        for (Integer integer : linkedList)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked List: "+linkedList+"\n");

        System.out.println("=> Displaying the Elements of the Linked List using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        linkedList.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Linked List are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : linkedList)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Linked List by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : linkedList)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Linked List: "+linkedList+"\n");

        System.out.println("=> Displaying the cube values of each element in the Linked List using 'map' and 'collect': ");
        List<Integer> squareValues = linkedList.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Linked List using 'filter' and 'reduce': ");
        int sumOfEvenElements = linkedList.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Linked List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Linked List using 'sorted' and 'forEach': ");
        linkedList.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
