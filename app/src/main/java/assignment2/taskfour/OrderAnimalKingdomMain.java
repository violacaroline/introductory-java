package assignment2.taskfour;

import java.util.ArrayList;

/**
 * Represents an Animal Kingdom.
 */
public class OrderAnimalKingdomMain {
  /**
   * Runs an Animal Kingdom program.
   *
   * @param args - Any command line arguments.
   */
  public static void main(String[] args) {
    Bird americanEagle = new Bird("American eagle", "Haliaeetus leucocephalus", 5.6, "Grraah Grraah", true, true, "Tree nests");
    Bird wanderingAlbatross = new Bird("Wandering albatross", "Diomedea exulans", 9.1, "Yiiaa Yiiaa", true, true, "Bowl built nests of grassy vegetation and soil peat on the ground");
    Mammal bengalTiger = new Mammal("Bengal tiger", "Panthera tigris tigris", 220, "Raaaaaawr", "Yellow-tan with black stripes", true);
    Mammal blueWildebeest = new Mammal("Blue wildebeest", "Connochaetes taurinus", 230, "Möö Möö", "Brown", false);
    Reptile pantherChameleon = new Reptile("Panther chameleon", 
            "Furcifer pardalis", 0.25, "Shhae Shhae", "Madagascar", false);
    Reptile gharial = new Reptile("Gharial", "Gavialis gangeticus", 160, "Djukushh Djukushh", "River banks of south/southwest asia", false);

    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(americanEagle);
    animals.add(wanderingAlbatross);
    animals.add(bengalTiger);
    animals.add(blueWildebeest);
    animals.add(pantherChameleon);
    animals.add(gharial);

    for (Animal animal : animals) {
      System.out.println(animal.getLatinName());
    }
  }  
}
