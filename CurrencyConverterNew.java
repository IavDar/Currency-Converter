

public class CurrencyConverterNew {


    String[] availableCurrencies;
    double [] currencyRates;

    CurrencyConverterNew () {

        currencyRates = new double [3];

        currencyRates [0] = 1.0;
        currencyRates [1] = 0.92;
        currencyRates [2] = 0.03;

        availableCurrencies = new String[3];
        availableCurrencies [0] = "EURO";
        availableCurrencies [1] = "USD";
        availableCurrencies [2] = "TL";
    }

    CurrencyConverterNew (double[] currencyRatesInput)
    {
        this.currencyRates = currencyRatesInput;

        availableCurrencies = new String[3];
        availableCurrencies [0] = "EURO";
        availableCurrencies [1] = "USD";
        availableCurrencies [2] = "TL";
    }

    CurrencyConverterNew (double[] currencyRatesInput, String [] availableCurrenciesInput )
    {
        this.currencyRates = currencyRatesInput;
        this.availableCurrencies = availableCurrenciesInput;


    }


    public void PrintIntro()
    {
        System.out.println(
                "Приветствуем в CurrencyConverter!\n\n" +
                        "Доступные валюты:\n"
        );

        for (String availableCurrency: availableCurrencies) {
            System.out.println(availableCurrency);
        }
        System.out.println("exit");
    }

    public double getRateValue(String currency)
    {
        double d = 0;

        switch (currency) {
            case "EURO":
                System.out.println("Перевести Евро");
                d = this.currencyRates [0];
                break;
            case "USD":
                System.out.println("Перевести доллары США");
                d = this.currencyRates [1];
                break;
            case "TL":
                System.out.println("Перевести турецкие лиры");
                d = this.currencyRates [2];
                break;

            default:
                System.out.println("Вы ввели неверную валюту.");
                System.exit(-1);
        }

        return d;

    }




}
