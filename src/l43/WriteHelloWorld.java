package l43;

import java.io.*;
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

        try (FileInputStream fis = new FileInputStream("resources\\file.txt")) {

            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {

                String line = scanner.nextLine();
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }

        try (FileOutputStream fos = new FileOutputStream("resources\\file1.txt")) {

            String greetings = "Hello World, I am Daria";

            fos.write(greetings.getBytes());

        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }


        try (BufferedReader br = new BufferedReader(new FileReader("resources\\file1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }


        try (FileReader fr = new FileReader("resources\\file1.txt")) {
            int i;

            while((i =fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }

    }

}
