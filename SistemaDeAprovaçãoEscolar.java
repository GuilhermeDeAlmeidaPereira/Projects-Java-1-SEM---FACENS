package switch_lista2;
import java.util.Scanner;
public class Switch_lista2 {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4, media, faltas;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a nota do 1° bimestre: ");
        nota1 = ler.nextDouble();
        if (nota1 > 10 || nota1 < 0) {
            System.out.println("Erro");
        }
        System.out.print("Digite a nota 2° bimestre: ");
        nota2 = ler.nextDouble();
        if (nota2 > 10 || nota2 < 0) {
            System.out.println("Erro");
        }

        System.out.print("Digite a nota 3° bimestre: ");
        nota3 = ler.nextDouble();
        if (nota3 > 10 || nota3 < 0) {
            System.out.println("Erro");
        }
        System.out.print("Digite a nota 4° bimestre: ");
        nota4 = ler.nextDouble();
        if (nota4 > 10 || nota4 < 0) {
            System.out.println("Erro");
        }
        System.out.println("Digite a quantidade de faltas: ");
        
        faltas = ler.nextDouble();        
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média aritmética entre elas é: " + media);

        if (media >= 7 && faltas <= 36) {
            System.out.println("ALUNO APROVADO!");           
        } else if (media >= 4 && media < 7 && faltas <= 36 ) {
            System.out.println("ALUNO DE EXAME FINAL");       
        } else {
            System.out.println("ALUNO REPROVADO");
            
        }
    }
}
