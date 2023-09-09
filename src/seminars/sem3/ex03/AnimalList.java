package seminars.sem3.ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalList {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal... animals) {
        this.animals.addAll(Arrays.asList(animals));
    }

    public void removeAnimalByIndex(int index) throws AnimalNotFoundException {
        if (this.animals.size() - 1 < index) {
            throw new AnimalNotFoundException("There aren't so many animals in the list.");
        }
        this.animals.remove(index);
    }

    public void removeAnimal(Animal animal) throws AnimalNotFoundException {
        if (this.animals.contains(animal)) {
            this.animals.remove(animal);
        } else {
            throw new AnimalNotFoundException("There isn't this animal in the list.");
        }

    }

    public void printAnimals() {
        System.out.println(animals);
    }

}
