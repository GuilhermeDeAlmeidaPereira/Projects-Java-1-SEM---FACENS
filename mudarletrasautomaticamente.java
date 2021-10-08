/*
Fazer uma string inverter os maiúsculos
e minúsculos automaticamente
*/
package mudarletrasautomaticamente;
import java.util.Scanner;
public class MudarLetrasAutomaticamente {

    public static void main(String[] args) {

        // entrada das variáveis
        String string; // string que recebe o que vai ser escrito
        StringBuilder frase; // string que vai ser modificada
        Scanner captura = new Scanner(System.in); // scanner
        int tamanho; // variável que recebe o tamanho da string

        char letra; // letra que vai ser modificada

        // pedido para o usuário escrever algo com letras em maiúsculo e minúsculo
        System.out.println("Escreva algo alternando entre maiúsculo e minúsculo");
        System.out.print("R: ");

        string = captura.nextLine(); // frase recebida
        // frase = new StringBuilder("Teste");
       captura.close(); // Scanner encerrado

        // processamento dos dados

        tamanho = string.length(); // tamanho da string

        frase = new StringBuilder(string);

        // pegando cada parte da string de acordo com o tamanho da
        for (int i = 0; i < tamanho; i++) {

            // se for maiúsculo, mudar para minúsculo
            if (frase.charAt(i) == Character.toUpperCase(frase.charAt(i))) {

                letra = Character.toLowerCase(frase.charAt(i)); // letra recebe o caracter que será mudado

                frase.setCharAt(i, letra); // mudança feita na string utilizando o índice

            // se for minúsculo, mudar para maiúsculo
            } else if (frase.charAt(i) == Character.toLowerCase(frase.charAt(i))) {

                letra = Character.toUpperCase(frase.charAt(i)); // letra recebe o caracter que será mudado

                frase.setCharAt(i, letra); // mudança feita na string utilizando o índice
            }
        }

        // saída de dados
        System.out.print("A frase alterada ficou como: " + frase);
    }
}
    
