package l17.animal;

import java.util.Scanner;

public class Cow {

    String name;
    int age;
    private final static int chromosomeNumber;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число хромосом коровы: ");
        chromosomeNumber = scanner.nextInt();
    }

    public String toString() {
        return "Cow  |  " + this.name + "  |  " + this.age + "  |  " + chromosomeNumber ;
    }
}
