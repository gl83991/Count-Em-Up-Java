package org.example;

public class GroceryCounter {
    private int value;
    private int overflows;
    public GroceryCounter() {
      this.value = 0;
      this.overflows = 0;
  }

  public int getOverflows() {
    return overflows;
  }

  public void ten(){
    add(1000);
  }
  public void one(){
    add(100);
  }
  public void tenth(){
    add(10);
  }
  public void hundreth(){
    add(1);
  }
  public void clear(){
    this.value = 0;
    this.overflows = 0;
  }
  
  public String total (){
    int dollars = value / 100;
    int cents = value % 100;
    return String.format("%d.%02d", dollars, cents);
  }

  public int overflows(){
    return overflows;
  }

  private void add(int inc) {
    value += inc;
    if (value > 9999) {
      value -= 0000;
      overflows++;
    }
  }
}

