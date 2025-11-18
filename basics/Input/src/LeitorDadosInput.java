import java.util.Scanner;

public class LeitorDadosInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Pedro qual é seu nome inteiro? ");
        String nomeDePedro = scan.nextLine();
        System.out.println("Foi revelado que o nome de Pedro é: " + nomeDePedro);

        System.out.println("Primeiro nome de Pedro: ");
        String primeiroNome = scan.next();
        System.out.println("Nome verdadeiro de pedro: " + primeiroNome);

        String[] primNome = nomeDePedro.split(" ");

        System.out.println("Checando verdades:");
        if (primeiroNome.equals(primNome[0])) {
            System.out.println("É verdade");
        }
        else {
            System.out.print("É mentira");
        }

        System.out.println("Idade de Pedro: ");
        int idade = scan.nextInt();
        System.out.println("Idade de Pedro: " + idade);

        if (idade == 17) {
            System.out.println("Eh verdadeee");
        }
    }
}
