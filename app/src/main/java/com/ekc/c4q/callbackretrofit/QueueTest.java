package com.ekc.c4q.callbackretrofit;

import com.ekc.c4q.callbackretrofit.model.MyQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    Queue<Integer> queue = new ArrayDeque<>();

    System.out.println("Adding 1");
    myQueue.add(1);
    queue.add(1);
    System.out.println("Adding 2");
    myQueue.add(2);
    queue.add(2);
    System.out.println("Adding 3");
    myQueue.add(3);
    queue.add(3);

    System.out.printf("Remove: %d == %d ? \n", myQueue.remove(), queue.remove());
    System.out.printf("Remove: %d == %d ? \n", myQueue.remove(), queue.remove());
    System.out.printf("Remove: %d == %d ? \n", myQueue.remove(), queue.remove());
  }
}
