package com.ekc.c4q.callbackretrofit.model;

public class MyStack {
  Node head;

  public int push(int item) {
    if (head == null) {
      head = new Node(null, item);
    } else {
      Node node = new Node(null, item);
      node.setNext(head);
      head = node;
    }
    return item;
  }

  public int pop() {
    if (head != null) {
      int val = head.getData();
      head = head.getNext();
      return val;
    } else {
      throw new IndexOutOfBoundsException("Stack is empty");
    }
  }

  public int peek() {
    if (head != null) {
      return head.getData();
    } else {
      throw new IndexOutOfBoundsException("Stack is empty");
    }
  }

  public boolean empty() {
    return head == null;
  }
}
