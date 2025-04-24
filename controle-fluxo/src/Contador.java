import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();
        }

        try {
            conta(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void conta(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

		int contagem = parametroDois - parametroUm;
		System.out.println("Número de iterações: " + contagem);

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
