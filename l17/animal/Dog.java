package l17.animal;

import java.util.Scanner;

public class Dog {

    String name;
    int age;
    private final static int chromosomeNumber;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число хромосом собаки: ");
        chromosomeNumber = scanner.nextInt();
    }

    public String toString() {
        return "Dog  |  " + this.name + "  |  " + this.age + "  |  " + chromosomeNumber ;
    }
}
