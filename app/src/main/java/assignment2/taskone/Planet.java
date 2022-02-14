package assignment2.taskone;

/**
 * Represents a planet.
 */
public class Planet {
  private String newName; // ARE THESE WRONG?
  private int newPos; // SHOULD THEY MATCH THE SETTERS PARAMETERS?
  private int newCount; // WHY IS TOBIAS MAKING EMPTY CONSTRUCTORS? LECTURE 3 ENG 1:04
  private int newAphelion;
  private int newPerihelion;
  
  /**
   * Instanciates a planet object.
   *
   * @param name - Name of planet.
   * @param position - Position of planet.
   * @param noOfMoons - The amount of moons the planet has.
   * @param aphelion - Distance to the point of the planets orbit furthest from the sun.
   * @param perihelion - Distance to the point of the planets orbit nearest to the sun.
   */
  public Planet(String name, int position, int noOfMoons, int aphelion, int perihelion) {
    setName(name);
    setPosition(position);
    setNoOfMoons(noOfMoons);
    setAphelion(aphelion);
    setPerihelion(perihelion);
  }

  /**
   * Gets a planets name.
   *
   * @return - The name of planet.
   */
  public String getName() {
    return newName;
  }

  /**
   * Validates and sets the planets name.
   *
   * @param newName - Planets name.
   */
  public void setName(String newName) {
    if (newName == null || newName.length() < 2) {
      this.newName = "Invalid name";
    } else {
      this.newName = newName;
    }
  }

  /**
   * Gets a planets position in the solar system.
   *
   * @return - The number representing the position.
   */
  public int getPosition() {
    return newPos;
  }

  /**
   * Validates and sets the planets position in the solar system.
   *
   * @param newPos - The number representing the planets position.
   */
  public void setPosition(int newPos) {
    if (newPos < 0) {
      this.newPos = 0;
    } else {
      this.newPos = newPos;
    }
  }

  /**
   * Returns the number of moons.
   *
   * @return - The amount of moons.
   */
  public int getNoOfMoons() {
    return newCount;
  }

  /**
   * Validates and sets the amount of moons.
   *
   * @param newCount - The amount of moons. 
   */
  public void setNoOfMoons(int newCount) {
    if (newCount < 0) {
      this.newCount = 0;
    } else {
      this.newCount = newCount;
    }
  }

  /**
   * Gets the aphelion distance.
   *
   * @return - Distance in km.
   */
  public int getAphelion() {
    return newAphelion;
  }

  /**
   * Validates and sets the aphelion distance.
   *
   * @param newAphelion - The distance in km.
   */
  public void setAphelion(int newAphelion) {
    if (newAphelion < 0) {
      this.newAphelion = 0;
    } else {
      this.newAphelion = newAphelion;
    }
  }

  /**
   * Returns the perihelion distance.
   *
   * @return - The distance in km.
   */
  public int getPerihelion() {
    return newPerihelion;
  }

  /**
   * Validates and sets the perihelion distance.
   *
   * @param newPerihelion - The distance in km.
   */
  public void setPerihelion(int newPerihelion) {    
    if (newPerihelion < 0) {
      this.newPerihelion = 0;
    } else {
      this.newPerihelion = newPerihelion;
    }  
  }  
}
