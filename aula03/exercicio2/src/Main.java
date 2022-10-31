import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numero=0, impares=0, pares=0;
	Scanner scan=new Scanner(System.in);
	for (int i = 0; i < 10; i++) {
	    System.out.println("Digite o "+(i+1)+"° número:");
	    numero=scan.nextInt();
	    if (numero % 2== 0) {
			pares++;
	    }else {
	        impares++;
	    }
	}
	System.out.println("Total de números pares:"+pares);
	System.out.println("Total de números impares:"+impares);
    }
}
