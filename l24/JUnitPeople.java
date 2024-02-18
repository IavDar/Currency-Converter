package l24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitPeople {

    @Test
    public void testEquals() {

        String gender = "Man";
        String name = "Bill";
        int age = 45;


        People people1 = new People (gender,name, age);
        People people2 = new People (gender, name, age);
        Man man1 = new Man("Джон", 40, "Офицер");

        People people3 = people1;

        Assertions.assertTrue(people1.equals(people2));
        Assertions.assertTrue(people1.equals(people3));
        Assertions.assertFalse(people1.equals(null));
        Assertions.assertFalse(people1.equals(man1));

        people2.name = "Sam";
        Assertions.assertFalse(people1.equals(people2));
        people2.name = name;

        people2.gender = "Woman";
        Assertions.assertFalse(people1.equals(people2));
        people2.gender = gender;

        people2.age = 50;
        Assertions.assertFalse(people1.equals(people2));
        people2.age = age;



    }
}
