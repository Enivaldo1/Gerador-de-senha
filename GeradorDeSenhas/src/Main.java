import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        System.out.print("GERANDO SENHA... \n");

        String caracteresEspeciais = "#$^&*()-_+=[]{}|;:<>";
        String numeros ="0123456789";

        System.out.print("SUA SENHA: ");

        for (int qtd = 0; qtd <= 1; qtd++) {
            int numIndice = aleatorio.nextInt(numeros.length());
            char numGerado = numeros.charAt(numIndice);
            System.out.print(numGerado);

            char charGerado = (char) (aleatorio.nextInt(26) + 'a');
            System.out.print(charGerado);

            char charMaiusculoGerado = (char) (aleatorio.nextInt(26) + 'A');
            System.out.print(charMaiusculoGerado);

            int indiceAleatorio = aleatorio.nextInt(caracteresEspeciais.length());
            char caractereEspecil = caracteresEspeciais.charAt(indiceAleatorio);
            if (caracteresEspeciais.contains(String.valueOf(caractereEspecil))) {
                System.out.print(caractereEspecil);
            }


        }
        System.out.println("");
        System.out.println("FINALIZANDO...");
    }
}


