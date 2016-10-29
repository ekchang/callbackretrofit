package com.ekc.c4q.callbackretrofit.model;

public class MyQueue {
  Node head;
  Node tail;

  public void add(int item) {
    if (tail == null) {
      head = new Node(null, item);
      tail = head;
    } else {
      tail.setNext(new Node(null, item));
      tail = tail.getNext();
    }
  }

  public int remove() {
    if (head != null) {
      int val = head.getData();
      head = head.getNext();
      return val;
    } else {
      throw new IndexOutOfBoundsException("Queue is empty");
    }
  }

  public int peek() {
    if (head != null) {
      return head.getData();
    } else {
      throw new IndexOutOfBoundsException("Queue is empty");
    }
  }

  public boolean empty() {
    return head == null;
  }
}
