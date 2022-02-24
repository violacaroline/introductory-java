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
    Moon theMoon = new Moon("The Moon", 3474);
    earth.addMoon(theMoon);
    displayPlanetsandMoons(earth);

    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);
    Moon phobos = new Moon("Phobos", 22);
    Moon deimos = new Moon("Deimos", 12);
    mars.addMoon(phobos);
    mars.addMoon(deimos);
    displayPlanetsandMoons(mars);
    
    Planet jupiter = new Planet("Jupiter", 5, 53, 816, 740);
    Moon europa = new Moon("Europa", 1560);
    jupiter.addMoon(europa);
    displayPlanetsandMoons(jupiter);   
  }

  /**
   * Displays planets moons.
   *
   * @param planet - The planets which moons are to be presented.
   */
  public static void displayPlanetsandMoons(Planet planet) {
    System.out.println("The planet is called " + planet.getName() + " and has the following moons:");

    for (int i = 0; i < planet.getMoons().length; i++) {
      System.out.println("  Moon " + (i + 1) + " is called " + planet.getMoons()[i].getName()
          + " (" + planet.getMoons()[i].getKmSize() + "km)");
    }
  }
}
