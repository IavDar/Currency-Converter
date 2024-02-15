package l23;


public class Bike extends Transport {

    protected String suspensionType;

    public Bike(String model, int year, String suspensionType ) {
        super(1 , model, year);

        this.suspensionType = suspensionType;

    }

    public void applySkill () {
        System.out.println("может ездить по велодорожкам");

    }
}
