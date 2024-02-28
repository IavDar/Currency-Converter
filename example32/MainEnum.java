package example32;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        for (MoonPhases moonPhase : MoonPhases.values()) {
            System.out.println(moonPhase.name() + ": " + moonPhase.getDescription());
        }

        System.out.print("Выберите день: ");
        Scanner scanner = new Scanner(System.in);
        String moonPhaseName = scanner.nextLine();
        MoonPhases moonPhase = MoonPhases.valueOf(moonPhaseName);
        switch (moonPhase) {
            case NEW_MOON:
                System.out.println("Вау, новолуние!" );
                break;
            case FULL_MOON:
                System.out.println("Вау, полнолуние!");
                break;

            default:
                System.out.println(moonPhase);


        }

    }

}
