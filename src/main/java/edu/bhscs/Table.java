package edu.bhscs;

public class Table {
  // fields and properties
  int counter;
  int legs;
  int Width;
  // constructor
  public Table(int counter, int legs) {
    this.counter = counter;
    this.legs = legs;
  }
  /////////////////////
  /// methods
  public int getWidth(){
    return this.Width;
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
