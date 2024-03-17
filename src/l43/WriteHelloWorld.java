package l43;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteHelloWorld {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("resources\\file.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World, I am Daria!");
            bw.flush();
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }

        try (
                FileInputStream fis = new FileInputStream("resources\\file.txt")
        ) {
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {
                // читаем построчно пока есть данные
                String line = scanner.nextLine();
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}
