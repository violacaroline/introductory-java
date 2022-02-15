package assignment2.taskthree;

/**
 * Represents an animal.
 */
public abstract class Animal {
  private String name;
  private String latinName;
  private Double weight;
  protected String sound;

  // DEFAULT CONSTRUCTOR? VARFÖR?
  public Animal() {}

  /**
   * A model to use for instanciating an object for another type. SINCE ANIMAL CAN'T BE INSTANCIATED?
   *
   * @param name - Name of specified animal.
   * @param latinName - Latin name of specified animal.
   * @param weight - Weight of animal.
   * @param sound - The sound the animal makes.
   */
  public Animal(String name, String latinName, Double weight, String sound) {
    this.name = name;
    this.latinName = latinName;
    this.weight = weight;
    this.sound = sound;
  }

  /**
   * Gets the animals name.
   *
   * @return - The kind of animal.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the animals name.
   *
   * @param name - The kind of animal.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the latin name of an animal.
   *
   * @return - The Latin name of an animal.
   */
  public String getLatinName() {
    return latinName;
  }

  /**
   * Sets the latin name of an animal.
   *
   * @param latinName - The latin name of an animal.
   */
  public void setLatinName(String latinName) {
    this.latinName = latinName;
  }

  /**
   * Gets the weight of an animal.
   *
   * @return - The weight of an animal.
   */
  public Double getWeight() {
    return weight;
  }

  /**
   * Sets the weight of an animal.
   *
   * @param weight - The weight of an animal.
   */
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * Gets the sound of a specific animal.
   *
   * @return - The sound an animal makes.
   */
  public String getSound() {
    return sound;
  }

  /**
   * Sets the sound of an animal.
   *
   * @param sound - The sound an animal makes.
   */
  public void setSound(String sound) {
    this.sound = sound;
  }
  
  /**
   * An abstract method to be implemented differently in different animal classes.
   */
  public abstract void makeSound();  
}
