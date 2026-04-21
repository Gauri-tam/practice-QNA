package org.activation.stackAndQueue;

import java.util.Stack;
import java.util.function.Predicate;

public class StackUsingArray {

    /**
     Problem Statement: Implement a Last-In-First-Out (LIFO) stack using an array.
     The implemented stack should support the following operations: push, pop, peek, and isEmpty.

     Input:
     ["ArrayStack", "push", "push", "top", "pop", "isEmpty"]
     [[], [5], [10], [], [], []]

     Output:
     [null, null, null, 10, 10, false]

     Explanation:
     ArrayStack stack = new ArrayStack();
     - stack.push(5);
     - stack.push(10);
     - stack.top(); // returns 10
     - stack.pop(); // returns 10
     - stack.isEmpty(); // returns false
     */

    public static void main(String[] args){
        String[] string = new String[6];
        int index = 0;

        Predicate

        System.out.println("---------------------");
        Runnable runnable = System.out::println;
        System.out.println(runnable);
        System.out.println("---------------------");

        ArrayStack stack = new ArrayStack();
        ++index;

        String push = stack.push(5);
        string[index] = push;
        ++index;

        String push1 = stack.push(10);
        string[index] = push1;
        ++index;

        int topRes = stack.top(); // returns 10 may not be supported in ArrayDeque, you can use peek() instead
        string[index] = String.valueOf(topRes);
        ++index;

        int popRes = stack.pop(); // returns 10
        string[index] = String.valueOf(popRes);
        ++index;

        boolean empty = stack.isEmpty(); // returns false
        string[index] = String.valueOf(empty);

        for (String s : string) {
            System.out.print(s + " ");
        }
    }
}

// we have top create a array stack class which will have the stack data structure and the methods push, pop, top and isEmpty.
// we can use java's built in Stack class to implement the stack functionality.
// The push method will add an element to the top of the stack, pop will remove and return the top element,
// top will return the top element without removing it,
// and isEmpty will check if the stack is empty.
class ArrayStack {

    // we can use java's built in Stack class to implement the stack functionality.
    Stack<Integer> stack = new Stack<>();

    public String push(int x) {
        stack.push(x);
        return null;
    }
    public int pop() {
        return stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
