import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int somaDiagPrincipal=0, somaDiagSecundária=0;
        int[] elemDiagPrincipal= new int[3];
        int[] elemDiagSecundaria= new int[3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    elemDiagPrincipal[i] = matriz[i][j];
                    somaDiagPrincipal += matriz[i][j];
                }
                if (i + j == 2) {
                    elemDiagSecundaria[i] = matriz[i][j];
                    somaDiagSecundária += matriz[i][j];
                }
            }
        }
        System.out.println("ELEMENTOS NA DIAGONAL PRINCIPAL"+ Arrays.toString(elemDiagPrincipal));
        System.out.println("ELEMENTOS NA DIAGONAL SECUNDÁRIA"+ Arrays.toString(elemDiagSecundaria));
        System.out.println("SOMA DOS ELEMENTOS NA DIAGONAL PRINCIPAL:"+somaDiagPrincipal);
        System.out.println("SOMA DOS ELEMENTOS NA DIAGONAL SECUNDÁRIA:"+somaDiagSecundária);
    }
}












