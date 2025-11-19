import java.util.Scanner;

public class papoDePescador {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o peso de peixes: ");
        double peso = scan.nextDouble();

        boolean excesso = false;
        double multa = 0;

        if (peso > 50) {
            excesso = true;
            multa = (peso - 50) * 4;
        }

        if (excesso) {
            System.out.println("Você excedeu 50 quilos e deve pagar " + multa + " reais de multa.");
        } else {
            System.out.println("Você não excedeu 50 quilos e por isso possui " + multa + " de multa.");
        }
    }
}
