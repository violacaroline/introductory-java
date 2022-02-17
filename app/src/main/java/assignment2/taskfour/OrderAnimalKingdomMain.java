package assignment2.taskfour;

import java.util.ArrayList;
import java.util.Collections;

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
    Bird americanEagle = new Bird("American eagle", "Haliaeetus leucocephalus",
          5.6, "Grraah Grraah", true, true, "tree nests");
    Bird wanderingAlbatross = new Bird("Wandering albatross", "Diomedea exulans",
          9.1, "Yiiaa Yiiaa", true, true, "bowl built nests of grassy vegetation and soil peat on the ground");
    Mammal bengalTiger = new Mammal("Bengal tiger", "Panthera tigris tigris",
          220, "Raaaaaawr", "yellow-tan with black stripes", true);
    Mammal blueWildebeest = new Mammal("Blue wildebeest", "Connochaetes taurinus", 
          230, "Möö Möö", "brown", false);
    Reptile pantherChameleon = new Reptile("Panther chameleon", "Furcifer pardalis",
          0.25, "Shhae Shhae", "Madagascar", false);
    Reptile gharial = new Reptile("Gharial", "Gavialis gangeticus",
          160, "Djukushh Djukushh", "river banks of south/southwest asia", false);

    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(americanEagle);
    animals.add(wanderingAlbatross);
    animals.add(bengalTiger);
    animals.add(blueWildebeest);
    animals.add(pantherChameleon);
    animals.add(gharial);

    Collections.sort(animals);

    for (Animal animal : animals) {
      if (animal.getClass().getSimpleName().equals("Bird")) {
        Bird bird = (Bird) animal;
        System.out.println(animal.getLatinName() + " puts its eggs in " + bird.getNestType());      
      } else if (animal.getClass().getSimpleName().equals("Mammal")) {
        Mammal mammal = (Mammal) animal;
        System.out.println(animal.getLatinName() + " has a fur that is " + mammal.getFurColor());
      } else {
        Reptile reptile = (Reptile) animal;
        System.out.println(animal.getLatinName() + " lives in " + reptile.getHabitat());
      }
    }
  }  
}
