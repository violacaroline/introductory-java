package assignment2.taskthree;

/**
 * Represents a reptile.
 */
public class Reptile extends Animal {
  private String habitat;
  private boolean isPoisonous;

  /**
   * Instanciates a reptile object.
   *
   * @param name        - Name of reptile.
   * @param latinName   - Latin name of reptile.
   * @param weight      - Weight of reptile.
   * @param sound       - The sound the reptile makes.
   * @param habitat     - Its habitat.
   * @param isPoisonous - Whether it is venomous.
   */
  public Reptile(String name, String latinName, double weight, String sound, String habitat, boolean isPoisonous) {
    super(name, latinName, weight, sound);

    setHabitat(habitat);
    setPoisonous(isPoisonous);
  }

  /**
   * Displays the specific reptile and its sound.
   *
   * @return - The specific animal and its sound. 
   */
  public String makeSound() {
    return "The " + this.getName() + " hizzes: " + this.getSound();
  }

  /**
   * Gets the reptiles habitat.
   *
   * @return - The habitat.
   */
  public String getHabitat() {
    return habitat;
  }

  /**
   * Sets the reptiles habitat.
   *
   * @param habitat - The habitat.
   */
  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  /**
   * Gets whether reptile is venomous.
   *
   * @return - True if reptile is venomous.
   */
  public boolean isPoisonous() {
    return isPoisonous;
  }

  /**
   * Sets whether reptile is venomous.
   *
   * @param isPoisonous - True if reptile is venomous.
   */
  public void setPoisonous(boolean isPoisonous) {
    this.isPoisonous = isPoisonous;
  }
}
