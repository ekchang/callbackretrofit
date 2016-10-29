package com.ekc.c4q.callbackretrofit;

public class MyCallback implements NumberGenerator.Callback {
  @Override public void onSuccess() {
    System.out.println("Success!");
  }

  @Override public void onFailure() {
    System.out.println("Failure!");
  }
}
