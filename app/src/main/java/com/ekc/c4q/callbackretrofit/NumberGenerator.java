package com.ekc.c4q.callbackretrofit;

import java.util.Random;

public class NumberGenerator {

  Callback callback;
  Random random;

  NumberGenerator(Callback callback) {
    this.callback = callback;
    random = new Random();
  }

  void printRandomNumbers() {
    int refCount = 0;
    while (refCount < 100) {
      int i = random.nextInt(101);
      System.out.println(i);

      if (i >= 75) {
        callback.onSuccess();
      } else if (i < 25) {
        callback.onFailure();
      }

      refCount++;
    }
  }

  /**
   * Callback that triggers onSuccess for numbers greater or equal to 75, or onFailure for numbers
   * less than 25.
   */
  interface Callback {

    void onSuccess();

    void onFailure();
  }
}
