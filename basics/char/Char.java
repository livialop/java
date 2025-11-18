public class Char {

    public static void main (String[] args) {

        char c = 1;

        char interrogacao = 0x00E1;

        for (int i = 1; i<=500; i++) {
            c += (char) i;
            System.out.println(c);
        }

        System.out.println(interrogacao);

    }
}
