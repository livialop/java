import java.util.Scanner;

public class Download {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tamanho do arquivo (Mb): ");
        double tamanho = scan.nextDouble();

        System.out.print("Velocidade da Internet (Mbps): ");
        double velocidade = scan.nextDouble();

        double tempoDemora = (tamanho/(velocidade/8))/60;

        System.out.print("O tempo de espera para baixar este arquivo (em minutos), é de " + tempoDemora + ".");


    }
}
