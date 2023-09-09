package seminars.sem3.ex03;

public class AnimalsApp {

    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal bird = new Animal("bird");
        Animal snake = new Animal("snake");

        AnimalList list = new AnimalList();

        list.addAnimal(cat, dog, bird, snake);

        list.printAnimals();

        try {
            list.removeAnimalByIndex(0);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimalByIndex(5);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

    }

}
