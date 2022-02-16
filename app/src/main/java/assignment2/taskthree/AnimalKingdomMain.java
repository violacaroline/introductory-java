package assignment2.taskthree;

/**
 * Represents a Animal Kingdom.
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

    Mammal ocelot = new Mammal("Ocelot", "Leopardus pardalis", 12.0, "Muau Rawr", "Yellow-tan with dark spots", true);
    ocelot.makeSound();

    Reptile coralillo = new Reptile("Coralillo", "Micrurus fulvius",
            1.9, "Tzzzzz Tzzzz", "Sandy, marshy area of southern U.S", true);
    coralillo.makeSound();
  }
}
