package l23;

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


    }
}
