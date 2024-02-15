package l23;

public class Cow extends Animal {

    protected int milkQuantity;

    public Cow(String name, int age, int milkQuantity ) {
        super(300, name, age);

        this.milkQuantity = milkQuantity;

    }

    public void applySkill () {
        System.out.println("Дает молоко");

    }
}
