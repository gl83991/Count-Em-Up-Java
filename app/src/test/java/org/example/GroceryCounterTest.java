package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroceryCounterTest {
  public static void main(String[] args) {
  GroceryCounter counter = new GroceryCounter();

  System.out.println(counter.total()); // Expected: 0.00
  counter.ten();
  counter.hundreth();

  System.out.println(counter.total());
  System.out.println(counter.overflows());

  for (int i = 0; i < 35; i++) {
    counter.one();
  }

  System.out.println(counter.total());
  System.out.println(counter.overflows());

  for (int i = 0; i < 100; i++) {
    counter.one();
  }

  System.out.println(counter.total());
  System.out.println(counter.overflows());

  counter.clear();

  System.out.println(counter.total());
  System.out.println(counter.overflows());
  }
}
