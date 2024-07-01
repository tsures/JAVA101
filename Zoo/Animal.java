 public class Animal {

    private String name;
    private String family;
    private int age;
    private double weight;
    private boolean carnivorous;
    private String fur;
    private SkinType skinType;
    private String color;
    private boolean hungry;

    

    // Constructor
    public Animal(String name, String family, int age, double weight, boolean carnivorous, String fur, SkinType skinType, String color, boolean hungry) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.weight = weight;
        this.carnivorous = carnivorous;
        this.fur = fur;
        this.skinType = skinType;
        this.color = color;
        this.hungry = hungry;
    }

    public Animal() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    public void setSkinType(SkinType skinType) {
        this.skinType = skinType;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    // Methods
    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        if (!hungry) {
            System.out.println(name + " is not hungry.");
            return;
        }
        if (carnivorous) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " is eating plants.");
        }
    }

    public void makeHungry() {
        hungry = true;
        System.out.println(name + " is now hungry.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", carnivorous=" + carnivorous +
                ", fur='" + fur + '\'' +
                ", skinType=" + skinType +
                ", color='" + color + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}



