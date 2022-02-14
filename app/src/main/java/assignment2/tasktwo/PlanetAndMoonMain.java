package assignment2.tasktwo;

/**
 * Represents a main class for Planet and Moon.
 */
public class PlanetAndMoonMain {
  /**
   * Runs Planet and Moon task.
   *
   * @param args - Any command line arguments.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("Earth", 3, 1, 152097701, 147098074);
    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);

    Moon theMoon = new Moon("The Moon", 3474);
    Moon phobos = new Moon("Phobos", 22);
    Moon deimos = new Moon("Deimos", 12);

    earth.addMoon(theMoon);
    mars.addMoon(phobos);
    mars.addMoon(deimos);

    System.out.println("The planet is called " + earth.getName() + " and has the following moons:");
    System.out.println("  Moon 1 is called " + earth.getMoons()[0].getName() + " (" + earth.getMoons()[0].getKmSize() + "km)");

    System.out.println("\nThe planet is called " + mars.getName() + " and has the following moons:");
    System.out.println("  Moon 1 is called " + mars.getMoons()[0].getName() + " (" + mars.getMoons()[0].getKmSize() + "km)");
    System.out.println("  Moon 2 is called " + mars.getMoons()[1].getName() + " (" + mars.getMoons()[1].getKmSize() + "km)");
  }
}
