/**
 * This class is to represent a dog object. I figured it would be a simple fun class to build.
 * A lot of the method code was generated by IntelliJ, so I can learn some features of the IDE
 */


public class Dog {

    private String name;
    private String breed;
    private String color;
    private int weight;
    private int age;

    /**
     * @param name name of dog as a String
     * @param breed breed of dog as a String
     * @param color color of dog as a String
     * @param weight weight to the nearest lb
     * @param age age to nearest year
     */
    public Dog(String name, String breed, String color, int weight, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    // make a dog without giving any info
    public Dog() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sit() {
        System.out.println(this.getName() + " sits");
    }

    public void bark(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(name + " says Woof!");
        }
    }

    public String howOld() {
        String ageIs = "";
        if (this.age == 1) {
            ageIs = this.name + " is 1 year old";
        } else {
            ageIs = this.name + " is " + this.age + " years old";
        }
        return ageIs;
    }

    // assume 2 lb weight gain with each meal - these dogs are hungry!
    public void eat (int x) {
        if (x == 1) {
            System.out.println(this.getName() + "Eats 1 lb of food");
        }
        else {
            System.out.println(this.getName() + "Eats " + x + " lbs of food");
        }
        this.setWeight(this.getWeight() + x);
    }
    // assuming all poops are 1 lb
    public void poop () {
            System.out.println(this.getName() + " poops");
        this.setWeight(this.getWeight() - 1);
    }

    public void displayWeight () {
        System.out.println(this.getName() + " weighs " + getWeight());
    }

}
