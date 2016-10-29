package com.ekc.c4q.callbackretrofit;

import com.ekc.c4q.callbackretrofit.model.MyStack;
import java.util.Stack;

public class StackTest {
  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    Stack<Integer> queue = new Stack<>();

    System.out.println("Adding 1");
    myStack.push(1);
    queue.push(1);
    System.out.println("Adding 2");
    myStack.push(2);
    queue.push(2);
    System.out.println("Adding 3");
    myStack.push(3);
    queue.push(3);

    System.out.printf("Remove: %d == %d ? \n", myStack.pop(), queue.pop());
    System.out.printf("Remove: %d == %d ? \n", myStack.pop(), queue.pop());
    System.out.printf("Remove: %d == %d ? \n", myStack.pop(), queue.pop());
  }
}
