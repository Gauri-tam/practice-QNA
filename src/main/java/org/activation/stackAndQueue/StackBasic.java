package org.activation.stackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class StackBasic {

    private static ArrayList string;

    public static void main(String[]  args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        System.out.println("---------------------");
        System.out.println("Pop " + stack.pop());

        steeam.map((string)).


        // only check the stack is empty or not!
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Peek " + stack.peek());
        System.out.println("Push " + stack.push(7));

        // search the element and return the position of the element from the top of the stack,
        // if not found return -1
        System.out.println("Search element Position " + stack.search(6));

        System.out.println("---------------------");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
