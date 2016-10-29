package com.ekc.c4q.callbackretrofit.model;

public class Node {
  private Node next;
  private int data;

  public Node(Node next, int data) {
    this.next = next;
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
