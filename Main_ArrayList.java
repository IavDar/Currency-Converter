import l17.transport.Car;
import l17.transport.ArrayList;

public class Main_ArrayList {

    public static void main(String[] args) {

        ArrayList carList = new ArrayList();
        Car car1 = new Car("Фольксваген", 4);
        Car car2 = new Car("Шкода", 3);
        Car car3 = new Car("БМВ", 2);
        Car car4= new Car("Рено", 5);
        Car car5 = new Car("Мерседес", 1);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);


        carList.removeByIndex(1);

        Car carByIndex = carList.getByIndex(0);

        System.out.println(carByIndex);


    }


}
