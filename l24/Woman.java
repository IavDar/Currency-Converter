package l24;

import l23.People;

public class Woman extends People {

    protected String HairLength;

    public Woman(String name, int age, String HairLength) {
        super("Woman", name, age);

        this.HairLength = HairLength;

    }

    public void applySkill () {
        System.out.println("Наносит макияж");

    }

}