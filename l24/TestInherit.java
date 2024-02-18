package l24;

import l23.*;

public class TestInherit {

    public static void main(String[] args) {

     Cat cat = new Cat("Том", 5, 2);
     cat.applySkill();

     Cow cow  = new Cow("Мила", 1, 15);
     cow.applySkill();

     Dog dog = new Dog("Бруно", 3, "Бульдог");
     dog.applySkill();

     Man man = new Man("Джон", 40, "Офицер");
     man.applySkill();

     Woman woman = new Woman("Анна", 30, "Длинные");
     woman.applySkill();

     Bike bike = new Bike("БМВ", 2, "Передняя подвеска");
     bike.applySkill();

     Bus bus = new Bus("Мерседес", 7, 435);
     bus.applySkill();

     Car car = new Car("Фольксваген", 4, 4 );
     car.applySkill();


     // переопределила метод equals() для класса People:

     Man man1, man2, man3;

     man1 = new Man("Джон", 40, "Офицер");
     man1.age = 40;

     man2 = new Man("Джон", 40, "Офицер");
     man2.age = 40;

     man3 = man1;

     System.out.println(man1.hashCode() == man2.hashCode()
                        && man1.equals(man2));

     System.out.println(man1.name.hashCode());

     System.out.println("Джон".hashCode());

    }
}
