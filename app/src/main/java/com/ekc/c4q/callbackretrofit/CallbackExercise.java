package com.ekc.c4q.callbackretrofit;

/**
 * 10/29/16 Erick Chang
 * Callback Exercise
 *
 * 1) NumberGenerator is a class that prints
 * 2) Attach a callback that calls an onSuccess() method whenever the number is greater than or
 * equal to 75.
 * 3) Have the callback call onFailure() when the number is smaller than 25.
 * 3) Inside onSuccess(), print "Success!"
 * 4) Inside onFailure(), print "Failure!"
 *
 * Hint: Your Callback should be an interface and you can create an instance of your callback via
 * an anonymous class or create an explicit class that implements your Callback.
 */
public class CallbackExercise {

  public static void main(String[] args) {
    NumberGenerator numberGenerator = new NumberGenerator();

    // Do not modify below, feel free to add/edit above this line
    numberGenerator.printRandomNumbers();
  }
}
