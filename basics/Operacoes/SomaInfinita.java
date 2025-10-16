class SomaInfinita {
    public static void main (String[] args) {
        int valorTotal = 0;
        int valorTotalDois = 0;

        for (String numero : args) {
            valorTotal += Integer.parseInt(numero);
        }

        for (int i = 0; i < args.length; i++) {
            valorTotalDois += Integer.parseInt(args[i]);
        }

        System.out.println("Valor total do digitado: " + valorTotal);
        System.out.println("Valor total do outro método: " + valorTotalDois);
    }
}