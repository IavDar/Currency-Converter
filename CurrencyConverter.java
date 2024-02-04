import java.util.Objects;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        String currencyFrom;
        String currencyIn;
        double x = 0;
        double y = 0;
        double [] exRate = new double [3];
        exRate [0] = 1.0;
        exRate [1] = 0.92;
        exRate [2] = 0.03;

        String[] availableCurr = {"EURO","USD", "TL"};

        PrintIntro(availableCurr);

        do {

            System.out.print("Введите валюту: ");
            Scanner scanner = new Scanner(System.in);
            currencyFrom = scanner.nextLine();


            if (Objects.equals(currencyFrom, "exit"))
            {
                System.out.println("До свидания!");
                continue;
            }
            else
            {
                x = getRateValue(currencyFrom, exRate);


            }

            System.out.print(
                    "В какую валюту перевести?\n\n"
            );


            System.out.print("Введите валюту: ");
            currencyIn = scanner.nextLine();

            switch (currencyIn) {
                case "EURO":
                    System.out.println("в Евро");
                    y = exRate [0];
                    break;
                case "USD":
                    System.out.println("в доллары США");
                    y = exRate [1];
                    break;
                case "TL":
                    System.out.println("в турецкие лиры");
                    y = exRate [2];
                    break;

                default:
                    System.out.println("Вы ввели неверную валюту.");
                    System.exit(-1);
            }


            System.out.print("Введите сумму перевода: ");
            double sum = scanner.nextDouble();

            double total = sum * x / y;

            System.out.print("Вы получите: ");
            System.out.println(total);

        } while (!currencyFrom.equals("exit"));

    }
    public static void PrintIntro(String[] availableCurr)
    {

        System.out.println(
                "Приветствуем в CurrencyConverter!\n\n" +
                        "Доступные валюты:\n"
        );

        for (String availableCurrency: availableCurr) {
            System.out.println(availableCurrency);
        }
        System.out.println("exit");

    }


    public static double getRateValue(String currency, double[] rates)
    {
        double d = 0;

        switch (currency) {
            case "EURO":
                System.out.println("Перевести Евро");
                d = rates [0];
                break;
            case "USD":
                System.out.println("Перевести доллары США");
                d = rates [1];
                break;
            case "TL":
                System.out.println("Перевести турецкие лиры");
                d = rates [2];
                break;

            default:
                System.out.println("Вы ввели неверную валюту.");
                System.exit(-1);
        }

        return d;

    }

}
