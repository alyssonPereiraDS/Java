import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[]=new int[3], maior=0;
        for(int i=0; i<numbers.length;i++){
            System.out.println("Digite o "+(i+1)+"° "+"número");
            numbers[i]=scan.nextInt();
            if (numbers[i]>=maior){
                maior=numbers[i];
            }
        }
        System.out.println("O maior número dos três é: "+maior);
    }
}
