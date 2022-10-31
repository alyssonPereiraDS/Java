import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
	    int numero, total=0;
	do {
	    System.out.println("Digite um número para somar ou digite 0 para sair:");
	    numero= scan.nextInt();
	    if (numero>0) {
			total += numero;
		}
    }while (numero!=0);
		System.out.println("A soma total do números positivos foi:"+total);
    }

}
