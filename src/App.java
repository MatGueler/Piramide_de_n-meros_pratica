import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Package to use input
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho da pirâmide?");

        int number = input.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for (int line = 1; line <= number; line++) {
            for (int collunm = 1; collunm < line; collunm++) {
                System.out.print(line);
            }
            System.out.println(line);
        }
    }
}
