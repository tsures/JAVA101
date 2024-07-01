public class Dog extends Animal {

    private DogType dogType;

    public enum DogType {
        AFFENPINSCHER,
        AFGHAN_HOUND,
        AIREDALE_TERRIER,
        AKITA
    }

    public Dog(String name, String family, int age, double weight, boolean carnivorous, String fur,
               SkinType skinType, String color, boolean hungry, DogType dogType) {
        super(name, family, age, weight, carnivorous, fur, skinType, color, hungry);
        this.dogType = dogType;
    }

    public Dog () {
        super();
    }

    // New methods specific to Dog
    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    public void run() {
        System.out.println(getName() + " is running.");
    }

    public void growl() {
        System.out.println(getName() + " is growling.");
    }

    public DogType getDogType() {
        return dogType;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", carnivorous=" + isCarnivorous() +
                ", fur='" + getFur() + '\'' +
                ", skinType=" + getSkinType() +
                ", color='" + getColor() + '\'' +
                ", hungry=" + isHungry() +
                ", dogType=" + dogType +
                '}';
    }

   
}
