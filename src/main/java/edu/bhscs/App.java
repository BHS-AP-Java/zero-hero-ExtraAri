package edu.bhscs;

/// TWO LEARNING OBJECTIVES OF 10/28/25
/// BECOME FAMILIAR WITH FENCE-POST PROBLEMS
/// UTULIZE LOOPS TO DRAW THINGS (LIKE TABLES)
public class App {
  public static void main(String[] args) {
    date10_28();
    date10_27();
    // Player user = new Player("me");
    // System.out.println(user);
    // new Cake().draw("Druv","11");

    // new Cake().draw("name", "age");

  }

  public static void date10_28() {
    Cake newCake = new Cake();
    newCake.growCake(20, 8, 1);
    newCake.draw();
  }

  public static void date10_27() {

    /*
     * Baker bob = new Baker("Bob"); Table t = new Table(5, 4); Cake bDay = bob.bakes(5, "Suzzie");
     * bDay.draw(t);
     */
  }

}

