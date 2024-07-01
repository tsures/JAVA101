

public class Zoo {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[4];

        // Initialize Animal objects and add them to the array
        animals[0] = new Animal("Lion", "Felidae", 5, 190.5, true, "Mane", SkinType.FUR, "Golden", false);
        animals[1] = new Dog("Rex", "Canidae", 3, 25.0, true, "Short fur", SkinType.FUR, "Brown", true, Dog.DogType.AFGHAN_HOUND);
        animals[2] = new Animal("Moose", "Cervidae", 7, 540.3, false, "Thick fur", SkinType.SKIN, "Brown", true);
        animals[3]  = new Shitsu("Shitzuiaa", "doget", 10, 120, false, "white", SkinType.SKIN, "white",true,Dog.DogType.AFGHAN_HOUND);

        // Display details of each animal in the array
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
