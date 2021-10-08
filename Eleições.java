package aprender.pkgdo.pkgwhile;
import java.util.Scanner;
public class exer2DoWhile {
      
    public static void main(String[] args) {  
         int c1 =0, c2= 0, c3= 0, c4 =0, nulo =0, branco =0, votos =0;
    
        Scanner ler = new Scanner(System.in);
    do {
        System.out.println("Vote:(1) para candidato nº1 - (2) para candidato n°2");
        System.out.println("     (3) para candidato nº3 - (4) para candidato n°4 ");
        System.out.println("     (5) para voto nulo     - (6) para voto em branco: ");
        votos = ler.nextInt();
        
        switch (votos) {
            case 1:
                System.out.println("Você votou no presidente 1!");
                c1++;
                break;
            case 2:
                System.out.println("Você votou no presidente 2!");
                c2++;
                break;
            case 3:
                System.out.println("Você votou no presidente 3!");
                c3++;
                break;
             case 4:
                System.out.println("Você votou no presidente 4!");
                c4++;
                break;
             case 5:
                System.out.println("Você votou nulo!");
                nulo++;
                break;
            case 6:
                System.out.println("Você votou para votos em branco!");
                branco++;
                break;
        }
      } while ( votos <7 && votos >0);
        System.out.println("Quantidade de votos no candidato N° 1: "+ c1);
        System.out.println("Quantidade de votos no candidato N° 2: "+ c2);
        System.out.println("Quantidade de votos no candidato N° 3: "+ c3);
        System.out.println("Quantidade de votos no candidato N° 4: "+ c4);
        System.out.println("Quantidade de votos nulo: "+ nulo);
        System.out.println("Quantidade de votos em branco: "+ branco);
    }
}
