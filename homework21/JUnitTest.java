package homework21;

import l17.transport.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @Test
    public void testCarConstructor() {

        String name = "Фольксваген";
        int age = 4;

        Car vw = new Car(name, age);

        Assertions.assertEquals(name, vw.name);
        Assertions.assertEquals(age, vw.age);

    }

    @Test
    public void testCarToString() {

        String name = "Фольксваген";
        int age = 4;

        Car vw = new Car(name, age);

        Assertions.assertEquals("Car  |  " + name + "  |  " + age, vw.toString());

        Assertions.assertEquals("Car  |  Фольксваген  |  4", vw.toString());

    }


}
