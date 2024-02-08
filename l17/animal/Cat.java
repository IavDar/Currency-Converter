package l17.animal;

import java.util.Scanner;

public class Cat {

    String name;
    int age;
    // добавляю приватное поле:
    private final static int chromosomeNumber;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // инициализирую приватное поле chromosomeNumber в статическом инициализаторе:
   static {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите число хромосом кота: ");
       chromosomeNumber = scanner.nextInt();
   }


    public String toString() {
        return "Cat  |  " + this.name + "  |  " + this.age + "  |  " + chromosomeNumber;
    }


}
