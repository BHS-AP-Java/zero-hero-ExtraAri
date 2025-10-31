package edu.bhscs;

public class Table {
  // fields and properties
  int counter;
  int legs;

  // constructor
  public Table(int counter, int legs) {
    this.counter = counter;
    this.legs = legs;
  }

  public void draw() {
    for (int x = 0; x < this.counter; x++) {
      System.out.print("=");

      for (int y = 0; y < this.counter; y++) {
        System.out.print("-");
      }
    }
    System.out.println();
    for (int z = 0; z < this.legs; z++) {
      for (int r = 0; r < this.counter; r++) {
        System.out.print(" [-] ");
        System.out.print(" ");
      }
      System.out.println();
    }

    System.out.println();
  }



}

// methods
