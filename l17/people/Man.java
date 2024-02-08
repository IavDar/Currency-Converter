package l17.people;

import java.util.Scanner;

public class Man {

    String name;
    int age;
    private final static int chromosomeNumber;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число хромосом мужчины: ");
        chromosomeNumber = scanner.nextInt();
    }


    public String toString() {
        return "Man  |  " + this.name + "  |  " + this.age + "  |  " + chromosomeNumber ;
    }
}
