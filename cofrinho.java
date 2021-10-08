import java.util.Scanner;
public class Lista32 {       
    public static void main(String[] args) {
        float produto;
        double umreal =0;
        double cinqcents =0;
        double vintecinco =0;
        double dezcents =0;
        double cincocents =0;
        double umcemts= 0;
        double soma;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        produto = ler.nextFloat();
        if ( produto < 0) {
            System.out.println("Erro");
        }
        System.out.print("Digite o N° de moedas de $1,00 : ");
        umreal = ler.nextDouble();

        System.out.print("Digite o N° de moedas de $0,50 : ");
        cinqcents = ler.nextDouble();

        System.out.print("Digite o N° de moedas de $0,25: ");
        vintecinco = ler.nextDouble();

        System.out.print("Digite o N° de moedas de $0,10: ");
        dezcents = ler.nextDouble();
        
        System.out.print("Digite o N° de moedas de $0,05: ");
        cincocents = ler.nextDouble();
        
        System.out.print("Digite o N° de moedas de $0,01: ");
        umcemts = ler.nextDouble();
        
        soma = umreal*(1.0) + cinqcents*(0.50) + (vintecinco* 0.25 ) + (dezcents*0.10) + (cincocents*0.05) + (umcemts*0.01);
        System.out.println("Você tem $" + soma + " reais no cofrinho");
       
        if (soma < produto) {
        System.out.println(" O total de reais que contem no cofrinho  não é o bastante para compra do produto");
        }
        else if (soma > produto){

        System.out.println("O total de reais que contem no cofrinho é o bastante para compra do produto");
        }
        
    } 
}
