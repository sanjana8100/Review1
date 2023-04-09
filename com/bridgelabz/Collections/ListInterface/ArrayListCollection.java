package com.bridgelabz.Collections.ListInterface;

import com.bridgelabz.Collections.Square;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Array List: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Array List: ");
        for (int i=0 ; i<num ; i++){
            arrayList.add(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.print("Enter the Element you want remove from the Array List: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = arrayList.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Array List");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.print("Enter an element to check if the Array List contains it: ");
        Integer element2 = in.nextInt();

        boolean status = arrayList.contains(element2);
        if (status)
            System.out.println("The Array List Contains the specified Element "+element2);
        else
            System.out.println("The Array List does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+arrayList.hashCode());

        System.out.println("=> Checking if the Array List is Empty..."+arrayList.isEmpty());

        System.out.println("=> Displaying the size of the Array List..."+arrayList.size());

        System.out.println("=> Displaying the Elements of the Array List using iterator... ");
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.println("=> Displaying the square values for all the values in the Array List: ");
        Square square = (int x) -> x*x;
        for (Integer integer : arrayList)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.println("=> Displaying the Elements of the Array List using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        arrayList.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Array List are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : arrayList)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Array List by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : arrayList)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array List: "+arrayList+"\n");

        System.out.println("=> Displaying the cube values of each element in the Array List using 'map' and 'collect': ");
        List<Integer> squareValues = arrayList.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Array List using 'filter' and 'reduce': ");
        int sumOfEvenElements = arrayList.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Array List using 'sorted' and 'forEach': ");
        arrayList.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
