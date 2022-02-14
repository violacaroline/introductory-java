package assignment2.taskone;

/**
 * Represents a planet.
 */
public class Planet {
  private String name;
  private int position;
  private int noOfMoons;
  private int aphelion;
  private int perihelion;
  
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
    this.name = name;
    this.position = position;
    this.noOfMoons = noOfMoons;
    this.aphelion = aphelion;
    this.perihelion = perihelion;
  }

  public String getName() {
    return name;
  }

  /**
   * Validates and sets the planets name.
   *
   * @param newName - Planets name.
   */
  public void setName(String newName) {
    if (newName == null || newName.length() < 2) {
      this.name = "Invalid name";
    } else {
      this.name = newName;
    }
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int newPos) {
    this.position = newPos;
  }

  public int getNoOfMoons() {
    return noOfMoons;
  }

  public void setNoOfMoons(int newCount) {
    this.noOfMoons = newCount;
  }

  public int getAphelion() {
    return aphelion;
  }

  public void setAphelion(int newAphelion) {
    this.aphelion = newAphelion;
  }

  public int getPerihelion() {
    return perihelion;
  }

  public void setPerihelion(int newPerihelion) {
    this.perihelion = newPerihelion;
  }
  
}
