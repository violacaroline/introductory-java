package assignment2.taskfour;

/**
 * Represents a mammal.
 */
public class Mammal extends Animal {
  private String furColor;
  private boolean hasWinterFur;

  /**
   * Instanciates a mammal object.
   *
   * @param name         - Name of mammal.
   * @param latinName    - Latin name of mammal.
   * @param weight       - Weight of mammal.
   * @param sound        - The sound the mammal makes.
   * @param furColor     - Its fur color.
   * @param hasWinterFur - If mammal has winter fur.
   */
  public Mammal(String name, String latinName, double weight, String sound, String furColor, boolean hasWinterFur) {
    super(name, latinName, weight, sound);

    setFurColor(furColor);
    setHasWinterFur(hasWinterFur);
  }

  /**
   * Displays the specific mammal and its sound.
   *
   * @return - The specific mammal and its sound.
   */
  public String makeSound() {
    return "The " + this.getName() + " says: " + this.getSound();
  }

  /**
   * Gets the fur color of a mammal.
   *
   * @return - The fur color.
   */
  public String getFurColor() {
    return furColor;
  }

  /**
   * Sets the fur color of a mammal.
   *
   * @param furColor - The fur color of the mammal.
   */
  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }

  /**
   * Gets whether mammal has winter fur or not.
   *
   * @return - True if mammal has winter fur.
   */
  public boolean isHasWinterFur() {
    return hasWinterFur;
  }

  /**
   * Sets to true if animal has winter fur.
   *
   * @param hasWinterFur - Specifies whether mammal has winter fur.
   */
  public void setHasWinterFur(boolean hasWinterFur) {
    this.hasWinterFur = hasWinterFur;
  }

  /**
   * Override method to return fur color.
   *
   * @return - The fur color. 
   */
  @Override
  public String extraInformation() {
    return getFurColor();
  }  
}
