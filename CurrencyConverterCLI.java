import java.util.Objects;
import java.util.Scanner;

public class CurrencyConverterCLI {

    public static void main(String[] args) {

        String currencyFrom;
        String currencyIn;
        double x;
        double y = 0;

        CurrencyConverterNew currencyConverterObject;

        double [] currencyRates = new double [3];
        currencyRates [0] = 1.0;
        currencyRates [1] = 0.92;
        currencyRates [2] = 0.03;



        currencyConverterObject = new CurrencyConverterNew(currencyRates);

        currencyConverterObject.PrintIntro();


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
                x = currencyConverterObject.getRateValue(currencyFrom);
            }

            System.out.print("В какую валюту перевести?\n\n");

            System.out.print("Введите валюту: ");
            currencyIn = scanner.nextLine();

            switch (currencyIn) {
                case "EURO":
                    System.out.println("в Евро");
                    y = currencyConverterObject.currencyRates [0];
                    break;
                case "USD":
                    System.out.println("в доллары США");
                    y = currencyConverterObject.currencyRates [1];
                    break;
                case "TL":
                    System.out.println("в турецкие лиры");
                    y = currencyConverterObject.currencyRates [2];
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





}
