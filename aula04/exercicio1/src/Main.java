import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] vetor={2,5,1,3,4,9,7,8,10,6};
        int  numeroPesquisado;
        boolean numeroEncontrado=false;
        System.out.println("Digite o número que deseja pesquisar no vetor:");
        numeroPesquisado=scan.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]==numeroPesquisado){
                System.out.println("O número "+numeroPesquisado+" está localizado na posição:"+i);
                numeroEncontrado=true;
                break;
            }
        };
        if (numeroEncontrado==false){
            System.out.println("O número "+numeroPesquisado+" não foi encontrado no vetor. ");
        }


    }
}
