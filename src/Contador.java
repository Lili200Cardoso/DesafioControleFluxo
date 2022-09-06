import dio.com.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o 1º parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o 2º parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O 2º parâmetro deve ser maior que o 1º.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;
        if(parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }

    }
}


