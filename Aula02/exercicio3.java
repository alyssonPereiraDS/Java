import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade=0;
        System.out.println("Digite sua idade: ");
        idade= scan.nextInt();
        if (idade>=10 && idade<=14){
            System.out.println("Você se enquadra na categoria infantil");
        }else if (idade<=17){
            System.out.println("Você se enquadra na categoria juvenil");
        }
        else if (idade>=18){
            System.out.println("Você se enquadra na categoria adulto");
        }
    }
}
