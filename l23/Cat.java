package l23;

public class Cat extends Animal {
    protected int furLength;

    public Cat(String name, int age, int furLength) {
        super(5, name, age);

        this.furLength = furLength;


    }

    public void applySkill () {
        System.out.println("Мяукает");

        super.applySkill();
    }


}
