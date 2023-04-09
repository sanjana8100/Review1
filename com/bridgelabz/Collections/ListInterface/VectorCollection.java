package com.bridgelabz.Collections.ListInterface;

import com.bridgelabz.Collections.Square;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class VectorCollection {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Vector: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Vector: ");
        for (int i=0 ; i<num ; i++){
            vector.add(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.print("Enter the Element you want remove from the Vector: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = vector.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Vector");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.print("Enter an element to check if the Vector contains it: ");
        Integer element2 = in.nextInt();

        boolean status = vector.contains(element2);
        if (status)
            System.out.println("The Vector Contains the specified Element "+element2);
        else
            System.out.println("The Vector does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+vector.hashCode());

        System.out.println("=> Checking if the Vector is Empty..."+vector.isEmpty());

        System.out.println("=> Displaying the size of the Vector..."+vector.size());

        System.out.println("=> Displaying the Elements of the Vector using iterator... ");
        Iterator<Integer> itr = vector.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.println("=> Displaying the square values for all the values in the Vector: ");
        Square square = (int x) -> x*x;
        for (Integer integer : vector)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.println("=> Displaying the Elements of the Vector using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        vector.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Vector are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : vector)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Vector by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : vector)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Vector: "+vector+"\n");

        System.out.println("=> Displaying the cube values of each element in the Vector using 'map' and 'collect': ");
        List<Integer> squareValues = vector.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Vector using 'filter' and 'reduce': ");
        int sumOfEvenElements = vector.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Linked List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Vector using 'sorted' and 'forEach': ");
        vector.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
