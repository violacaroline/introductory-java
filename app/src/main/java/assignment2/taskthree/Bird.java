package assignment2.taskthree;

/**
 * Represents a bird.
 */
public class Bird extends Animal {
  private boolean isMigrant;
  private boolean canFly;
  private String nestType;

  /**
   * Instanciates a bird object.
   *
   * @param name      - Name of bird.
   * @param latinName - Latin name of bird.
   * @param weight    - Weight of bird.
   * @param sound     - The sound the bird makes.
   * @param isMigrant - Whether bird migrates.
   * @param canFly    - Whether bird flies.
   * @param nestType  - Its type of nest.
   */
  public Bird(String name, String latinName, double weight, String sound, boolean isMigrant, boolean canFly,
      String nestType) {
    super(name, latinName, weight, sound);

    // VARFÖR GÖR MAN SÅ HÄR VS THIS.ISMIGRANT = ISMIGRANT?
    setMigrant(isMigrant);
    setCanFly(canFly);
    setNestType(nestType);
  }

  /**
   * Displays the specific bird and its sound.
   */
  public void makeSound() {
    System.out.println("The " + this.getName() + " tweets: " + this.getSound());
  }

  /**
   * Gets whether bird migrates or not.
   *
   * @return - True if bird migrates.
   */
  public boolean isMigrant() {
    return isMigrant;
  }

  /**
   * Sets whether bird migrates.
   *
   * @param isMigrant - True if bird migrates.
   */
  public void setMigrant(boolean isMigrant) {
    this.isMigrant = isMigrant;
  }

  /**
   * Gets whether bird flies or not.
   *
   * @return - True if bird can fly.
   */
  public boolean isCanFly() {
    return canFly;
  }

  /**
   * Sets whether bird flies or not.
   *
   * @param canFly - True if bird can fly.
   */
  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  /**
   * Gets the type of nest the bird makes.
   *
   * @return - The nest type.
   */
  public String getNestType() {
    return nestType;
  }

  /**
   * Sets the type of nest the bird makes.
   *
   * @param nestType - The nest type.
   */
  public void setNestType(String nestType) {
    this.nestType = nestType;
  }
}
