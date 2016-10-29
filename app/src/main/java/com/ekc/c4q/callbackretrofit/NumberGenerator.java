package com.ekc.c4q.callbackretrofit;

import java.util.Random;

public class NumberGenerator {

  Random random;

  NumberGenerator() {
    random = new Random();
  }

  void printRandomNumbers() {
    int refCount = 0;
    while (refCount < 100) {
      int i = random.nextInt(101);
      System.out.println(i);
      refCount++;
    }
  }
}
