package assignment2.taskthree;

/**
 * Represents a Animal Kingdom program.
 */
public class AnimalKingdomMain {
  /**
   * Runs a Animal Kingdom program.
   *
   * @param args - Any command line arguments.
   */
  public static void main(String[] args) {
    Bird toh = new Bird("Toh", "Eumomota superciliosa", 0.2, "Tweet tweet twoo", false, true, "Rock walls");

    toh.makeSound();
    System.out.println("Charcteristics " + toh.getWeight());
  }
}
