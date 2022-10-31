import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int idade=0, total21=0, total50=0;
	Scanner scan= new Scanner(System.in);
	while (idade>=0) {
	    System.out.println("Digite sua idade ou digite um número negativo para sair:");
	    idade=scan.nextInt();
	    if (idade<21 && idade >=0) {
	        total21++;
        }else if (idade >50) {
            total50++;
    }

    }
	System.out.println("Total de pessoas menores de 21 anos:"+total21);
	System.out.println("Total de pessoas maiores de 50 anos:"+total50);

    }
}
