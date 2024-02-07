import l17.animal.Cat;
import l17.animal.Cow;
import l17.animal.Dog;
import l17.people.Man;
import l17.people.Woman;
import l17.transport.Bike;
import l17.transport.Bus;
import l17.transport.Car;
public class L17Main {
    public static void main(String[] args) {

        Cat tom = new Cat("Том", 5);
        System.out.println(tom);

        Cow mila = new Cow("Мила", 1);
        System.out.println(mila);

        Dog bruno = new Dog("Бруно", 3);
        System.out.println(bruno);

        Man john = new Man("Джон", 40);
        System.out.println(john);

        Woman anna = new Woman("Анна", 30);
        System.out.println(anna);

        Bike bmw = new Bike("БМВ", 2);
        System.out.println(bmw);

        Bus mercedes = new Bus("Мерседес", 7);
        System.out.println(mercedes);

        Car vw = new Car("Фольксваген", 4);
        System.out.println(vw);


    }

}
