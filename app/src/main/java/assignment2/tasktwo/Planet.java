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
    setName(name);
    setPosition(position);    
    setAphelion(aphelion);
    setPerihelion(perihelion);
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
    if (name == null || name.length() < 2) {
      this.name = "Invalid name";
    } else {
      this.name = name;
    }
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
    if (position < 0) {
      this.position = 0;
    } else {
      this.position = position;
    }
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
    moons.add(theNewMoon); // VALIDATE FOR UNEXISTING NAME?
  }

  /**
   * Converts the arraylist of moons to an array of moons.
   *
   * @returns - An array of moons.
   */
  public Moon[] getMoons() {
    Moon[] showMoons = moons.toArray(new Moon[0]); // IS THIS REALLY CORRECT? CHECK WITH TA'S

    return showMoons;
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
    if (aphelion < 0) {
      this.aphelion = 0;
    } else {
      this.aphelion = aphelion;
    }
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
    if (perihelion < 0) {
      this.perihelion = 0;
    } else {
      this.perihelion = perihelion;
    }  
  } 
}
