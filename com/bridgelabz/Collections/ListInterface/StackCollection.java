package com.bridgelabz.Collections.ListInterface;

import com.bridgelabz.Collections.Square;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements you want to add to the Stack: ");
        int num = in.nextInt();

        System.out.println("Enter the Elements for the Stack: ");
        for (int i=0 ; i<num ; i++){
            stack.push(in.nextInt());
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.println("The Top Element of the Stack is: "+stack.peek());

        System.out.print("Popping the element from the Stack: ");
        Integer element = stack.pop();
        System.out.println(element+" removed!!!");

        System.out.println("The Top Element of the Stack after popping is: "+stack.peek());

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.print("Enter the Element you want remove from the Stack: ");
        Integer element1 = in.nextInt();

        boolean isRemoved = stack.remove(element1);
        if (isRemoved)
            System.out.println(element1+" removed!!!");
        else
            System.out.println(element1+" is not found in the Stack");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.print("Enter an element to check if the Stack contains it: ");
        Integer element2 = in.nextInt();

        boolean status = stack.contains(element2);
        if (status)
            System.out.println("The Stack Contains the specified Element "+element2);
        else
            System.out.println("The Stack does NOT contain the specified Element "+element2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.println("=> Displaying the Hash Code Value for this Collection... "+stack.hashCode());

        System.out.println("=> Checking if the Stack is Empty..."+stack.isEmpty());

        System.out.println("=> Displaying the size of the Stack..."+stack.size());

        System.out.println("=> Displaying the Elements of the Stack using iterator... ");
        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying User-defined Functional Interface...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.println("=> Displaying the square values for all the values in the Stack: ");
        Square square = (int x) -> x*x;
        for (Integer integer : stack)
            System.out.print(square.calculate(integer)+" ");

        System.out.println("\nApplying Pre-defined Functional Interfaces and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.println("=> Displaying the Elements of the Stack using Consumer Functional Interface: ");
        Consumer<Integer> consumer = value -> System.out.print(value+" ");
        stack.forEach(consumer);

        System.out.println("\n=> Checking if all the Elements of the Stack are greater than 0 using Predicate Functional Interface: ");
        Predicate<Integer> predicate = value -> (value>0);
        for (Integer integer : stack)
            System.out.print(predicate.test(integer)+" ");

        System.out.println("\n=> Incrementing all the elements in the Stack by 5 values using Function Functional Interface: ");
        Function<Integer,Integer> function = value -> (value+5);
        for (Integer integer : stack)
            System.out.print(function.apply(integer)+" ");

        System.out.println("\n*****************************************************************************************************");
        System.out.println("Applying Stream API and Lambda Expressions...");

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("The Stack: "+stack+"\n");

        System.out.println("=> Displaying the cube values of each element in the Stack using 'map' and 'collect': ");
        List<Integer> squareValues = stack.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(squareValues);

        System.out.println("=> Displaying the sum of all even elements in the Stack using 'filter' and 'reduce': ");
        int sumOfEvenElements = stack.stream().filter(x -> (x%2 == 0)).reduce(0,(integer,i) -> integer+i);
        System.out.println("[Sum of all the Even Elements in the Linked List is: "+sumOfEvenElements+"]");

        System.out.println("=> Sorting and Displaying the elements in the Stack using 'sorted' and 'forEach': ");
        stack.stream().sorted().forEach(y -> System.out.print(y+" "));

        System.out.println();
    }
}
