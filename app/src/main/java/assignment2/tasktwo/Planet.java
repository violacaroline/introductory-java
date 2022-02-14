package assignment2.tasktwo;

import java.util.ArrayList;

/**
 * Represents a planet.
 */
public class Planet {
  private String name;
  private int position;
  private int noOfMoons;
  private int aphelion;
  private int perihelion;
  private ArrayList<Moon> moons = new ArrayList<>();

  /**
   * Instanciates a new planet object.
   *
   * @param name - The name of the planet.
   * @param position - The position of the planet in the solar system.
   * @param noOfMoons - The number of moons the planet has.
   * @param aphelion - The distance to aphelion in km.
   * @param perihelion - The distance to perihelion in km.
   */
  public Planet(String name, int position, int noOfMoons, int aphelion, int perihelion) {
    this.name = name;
    this.position = position;
    this.noOfMoons = noOfMoons;
    this.aphelion = aphelion;
    this.perihelion = perihelion;
  }

  /**
   * Gets a planets name.
   *
   * @return - The name of planet.
   */
  public String getName() {
    return name;
  }

  /**
   * Validates and sets a planets name.
   *
   * @param name - The name of the planet.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the position of a planet in the solar system.
   *
   * @return - The number representing the planets position.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Validates and sets a planets position in the solar system.
   *
   * @param position - The number representing the planets position.
   */
  public void setPosition(int position) {
    this.position = position;
  }

  /**
   * Gets the planets amount of moons.
   *
   * @return - The number of moons.
   */
  public int getNoOfMoons() {
    return noOfMoons;
  }

  /**
   * Adds a new moon to the planet.
   *
   * @param theNewMoon - The name of the moon.
   */
  public void addMoon(Moon theNewMoon) {
    // FIX
    moons.add(theNewMoon);
  }

  /**
   * Displays an array of moons.
   */
  public void getMoons() {
    // RETURN ARRAY OF MOONS
  }

  /**
   * Gets the distance to aphelion.
   *
   * @return - Distance in km.
   */
  public int getAphelion() {
    return aphelion;
  }

  /**
   * Validates and sets distance to aphelion.
   *
   * @param aphelion - The distance in km.
   */
  public void setAphelion(int aphelion) {
    this.aphelion = aphelion;
  }

  /**
   * Gets the distance to perihelion.
   *
   * @return - Distance in km.
   */
  public int getPerihelion() {
    return perihelion;
  }

  /**
   * Validates and sets the distance to perihelion.
   *
   * @param perihelion - Distance in km.
   */
  public void setPerihelion(int perihelion) {
    this.perihelion = perihelion;
  } 
}
