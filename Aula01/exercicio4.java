import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2, num3, num4, produto;
        System.out.println("Digite o primeiro número:");
        num1= scan.nextFloat();
        System.out.println("Digite o segundo número:");
        num2= scan.nextFloat();
        System.out.println("Digite o terceiro número:");
        num3= scan.nextFloat();
        System.out.println("Digite o quarto número:");
        num4= scan.nextFloat();
        produto= (num1*num2)-(num3*num4);
        System.out.println("O produto da diferença dos números é: "+produto);
    }
}
