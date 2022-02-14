package assignment2.taskone;

/**
 * Main entry for planet class.
 */
public class PlanetMain {
  /**
   * Creates planet objects.
   *
   * @param args - Any command line arguments.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("E", 3, 1, 152097701, 147098074);
    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);

    printPlanets(earth);
    printPlanets(mars);
  }

  /**
   * Prints out the information of desired planet.
   *
   * @param planet - The planet to present.
   */
  public static void printPlanets(Planet planet) {
    System.out.println(planet.getName() + ":");
    System.out.println("  Position: " + planet.getPosition());
    System.out.println("  Moons: " + planet.getNoOfMoons());
    System.out.println("  Aphelion: " + planet.getAphelion() + " km");
    System.out.println("  Perihelion: " + planet.getPerihelion() + " km");
  }
}
