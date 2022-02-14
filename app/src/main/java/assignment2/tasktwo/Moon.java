package assignment2.tasktwo;

/**
 * Represents a moon.
 */
public class Moon {
  private String name;
  private int kmSize;

  public Moon(String name, int kmSize) {
    this.name = name;
    this.kmSize = kmSize;
  }
  
  public String getName() {
    return name;
  }
  
  public int getKmSize() {
    return kmSize;
  }
}
