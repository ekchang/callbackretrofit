package com.ekc.c4q.callbackretrofit;

import com.ekc.c4q.callbackretrofit.model.Node;

public class LinkedListTest {

  public static void main(String[] args) {

    int[] integers = new int[] {
        1, 4, 8, 9, 14
    };

    Node linkedList = toLinkedList(integers);

    Node currentNode = linkedList;
    for (int i : integers) {
      System.out.printf("array: %d, ll: %d\n", i, currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  static Node toLinkedList(int[] integers) {
    Node head = null;
    Node tail = null;

    for (int i : integers) {
      Node node = new Node(null, i);
      if (tail == null) {
        tail = node;
        head = node;
      }
      tail.setNext(node);
      tail = node;
    }

    return head;
  }
}
