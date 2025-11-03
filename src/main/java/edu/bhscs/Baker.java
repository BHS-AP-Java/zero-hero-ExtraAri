package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS

  int cash;
  String name = "Bob, Ted, Alice";
  int skill = 1;

  // CONSTRUCTOR
  public Baker(String name) {
    this.name = name;
  }

  // METHODS

  public void learn(int amount) {
    this.skill += amount;
  }

  /*
   * Cake bakeCake() { String answer = this.p.giveAnswer("what cake do you you want?");
   * this.skill++; return new Cake(answer, this.f, this.skill); }
   */

  Cake bakes(int size, String buyerName) {
    this.skill++;
    /// System.out.println(this.name + " is baking a cake for " + buyerName);
    return new Cake(size, this.skill, buyerName);
  }
}
