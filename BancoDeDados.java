package aprender.pkgdo.pkgwhile;
import java.util.Scanner;
public class exer9dowhile {
    public static void main(String[] args){
    float altura, altura_mulheres = 0, idadem = 0, idade, idade_homens = 0;
        int condição = 0, sexo, contador_mulheres = 0, contador_homens = 0;
        int contador_percentual = 0;
        Scanner ler = new Scanner(System.in);
        do {
            do {
                System.out.print("\nInsira seu gênero (1 para masculino "
                        + "e 0 para feminino): ");
                sexo = ler.nextInt();
                if (sexo != 0 && sexo != 1) {
                    System.out.println("\nResposta inválida. "
                            + "Tente novamente.");
                } else if (sexo == 1) {
                    contador_homens++;
                } else {
                    contador_mulheres++;
                }
            } while (sexo != 0 && sexo != 1);
            System.out.print("Insira sua idade: ");
            idade = ler.nextFloat();
            idadem += idade;
            if (sexo == 1) {
                idade_homens += idade;
            }
            if (idade >= 18 && idade <= 35) {
                contador_percentual++;
            }
            System.out.print("Insira sua altura (em cm): ");
            altura = ler.nextFloat();
            if (sexo == 0) {
                altura_mulheres += altura;
            }
            condição++;
        } while (condição < 4);
        System.out.println("\nA - Média da idade do grupo: "
                + (idadem / condição)
                + " anos de idade\nB - Média da altura das mulheres:  "
                + (altura_mulheres / contador_mulheres)
                + " cm\nC - Média da idade dos homens: "
                + (idade_homens / contador_homens)
                + " anos de idade"
                + "\nD - Percentual de pessoas cuja idade está "
                + "entre 18 e 35: "
                + ((contador_percentual * 100) / condição) + "%\n");
    }
}
