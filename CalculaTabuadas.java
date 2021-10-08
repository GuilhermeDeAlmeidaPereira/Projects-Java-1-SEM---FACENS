import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {

        // declarando variáveis
        Scanner ler = new Scanner(System.in); // variável de scanner

        int tabuada, de, até, resultado;

        // processamento do algoritmo
        System.out.print("Montar a tabuada de: "); //a tabuada
        tabuada = ler.nextInt();

        System.out.print("Começar por: "); // de
        de = ler.nextInt();

        System.out.print("Terminar em:  "); // até
        até = ler.nextInt();
        
        System.out.println(""); //pula linha
        
        System.out.println("Vou montar a tabuada de "+tabuada+ " começando em "+de+ " e terminando em " +até+ ":");

        // multiplicando
        for (int i = de; i <= até; i++) {

            // cauculandoo resultado de cada multiplicação
            resultado = i * tabuada;

            // print de cada conta
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }
    }
}
