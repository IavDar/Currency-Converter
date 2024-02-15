package l23;

public class Dog extends Animal {
    protected String breed;

    public Dog(String name, int age, String breed) {
        super(30, name, age);
        this.breed = breed;

    }

    public void applySkill () {
        System.out.println("Лает");

    }
}
