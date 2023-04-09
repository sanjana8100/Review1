package com.bridgelabz.Collections.DequeInterface;

import com.bridgelabz.Collections.Square;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ArrayDequeCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Array Deque: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Array Deque: ");
        for (int i=0 ; i<num ; i++){
            arrayDeque.add(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.print("Enter an Element you want to add to the end of Array Deque: ");
        arrayDeque.addLast(in.nextInt());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.print("Enter an Element you want to add to the front of Array Deque: ");
        arrayDeque.addFirst(in.nextInt());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("The Front Element of the Array Deque is: "+arrayDeque.peekFirst());

        System.out.print("Removing and printing the Front Element from the Array Deque: ");
        Integer element = arrayDeque.pollFirst();
        System.out.println(element+" removed!!!");

        System.out.println("The Front Element of the Array Deque after removing is: "+arrayDeque.peekFirst());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("The End Element of the Array Deque is: "+arrayDeque.peekLast());

        System.out.print("Removing and printing the End Element from the Array Deque: ");
        Integer elements = arrayDeque.pollLast();
        System.out.println(elements+" removed!!!");

        System.out.println("The End Element of the Array Deque after removing is: "+arrayDeque.peekLast());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.print("Enter the Element you want remove from the Array Deque: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = arrayDeque.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Array Deque");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.print("Enter an element to check if the Array Deque contains it: ");
        int element2 = in.nextInt();

        boolean status = arrayDeque.contains(element2);
        if (status)
            System.out.println("The Array Deque Contains the specified Element "+element2);
        else
            System.out.println("The Array Deque does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+arrayDeque.hashCode());

        System.out.println("=> Checking if the Array Deque is Empty..."+arrayDeque.isEmpty());

        System.out.println("=> Displaying the size of the Array Deque..."+arrayDeque.size());

        System.out.println("=> Displaying the Elements of the Array Deque using iterator... ");
        Iterator<Integer> itr = arrayDeque.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("=> Displaying the square values for all the values in the Array Deque: ");
        Square square = (int x) -> x*x;
        for (Integer integer : arrayDeque)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("=> Displaying the Elements of the Array Deque using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        arrayDeque.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Array Deque are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : arrayDeque)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Array Deque by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : arrayDeque)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Array Deque: "+arrayDeque+"\n");

        System.out.println("=> Displaying the cube values of each element in the Array Deque using 'map' and 'collect': ");
        List<Integer> squareValues = arrayDeque.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Array Deque using 'filter' and 'reduce': ");
        int sumOfEvenElements = arrayDeque.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Array Deque using 'sorted' and 'forEach': ");
        arrayDeque.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
