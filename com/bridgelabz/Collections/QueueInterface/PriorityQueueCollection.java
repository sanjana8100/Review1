package com.bridgelabz.Collections.QueueInterface;

import com.bridgelabz.Collections.Square;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Priority Queue: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Priority Queue: ");
        for (int i=0 ; i<num ; i++){
            priorityQueue.add(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.println("The Top Element of the Priority Queue is: "+priorityQueue.peek());

        System.out.print("Removing and printing the top element from the Priority Queue: ");
        Integer element = priorityQueue.poll();
        System.out.println(element+" removed!!!");

        System.out.println("The Top Element of the Priority Queue after removing is: "+priorityQueue.peek());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.print("Enter the Element you want remove from the Priority Queue: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = priorityQueue.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Priority Queue");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.print("Enter an element to check if the Priority Queue contains it: ");
        int element2 = in.nextInt();

        boolean status = priorityQueue.contains(element2);
        if (status)
            System.out.println("The Priority Queue Contains the specified Element "+element2);
        else
            System.out.println("The Priority Queue does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+priorityQueue.hashCode());

        System.out.println("=> Checking if the Priority Queue is Empty..."+priorityQueue.isEmpty());

        System.out.println("=> Displaying the size of the Priority Queue..."+priorityQueue.size());

        System.out.println("=> Displaying the Elements of the Priority Queue using iterator... ");
        Iterator<Integer> itr = priorityQueue.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.println("=> Displaying the square values for all the values in the Priority Queue: ");
        Square square = (int x) -> x*x;
        for (Integer integer : priorityQueue)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.println("=> Displaying the Elements of the Priority Queue using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        priorityQueue.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Priority Queue are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : priorityQueue)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Priority Queue by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : priorityQueue)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Priority Queue: "+priorityQueue+"\n");

        System.out.println("=> Displaying the cube values of each element in the Priority Queue using 'map' and 'collect': ");
        List<Integer> squareValues = priorityQueue.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Priority Queue using 'filter' and 'reduce': ");
        int sumOfEvenElements = priorityQueue.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Array List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Priority Queue using 'sorted' and 'forEach': ");
        priorityQueue.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
