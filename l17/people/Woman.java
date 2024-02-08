package l17.people;

import java.util.Scanner;

public class Woman {
    String name;
    int age;
    private final static int chromosomeNumber;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число хромосом женщины: ");
        chromosomeNumber = scanner.nextInt();
    }

    public String toString() {
        return "Woman  |  " + this.name + "  |  " + this.age + "  |  " + chromosomeNumber;
    }
}
