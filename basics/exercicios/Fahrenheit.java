import java.util.Scanner;

public class Fahrenheit {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

    }
}
