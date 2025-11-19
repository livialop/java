import java.util.Scanner;

public class PesoIdeal {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.print("O peso ideal para a sua altura é " + pesoIdeal);

    }
}
