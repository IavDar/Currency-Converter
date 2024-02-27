package l31;

public class MainLambda {
    public static void main(String[] args) {

        Calculator division = (a, b) -> a / b;

        Calculator modulus = (a, b) -> a % b;

        System.out.println("Рзультат деления 8 на 4 равен " + division.operate(8, 4));
        System.out.println("Остаток от деления 9 на 2 равен " + modulus.operate(9, 2));


    }
}
