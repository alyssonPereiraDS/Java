package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float salario, abono, salarioNovo;
        System.out.println("Digite o valor do seu salário:");
        salario= scan.nextFloat();
        System.out.println("Digite o valor do abono:");
        abono= scan.nextFloat();
        salarioNovo=salario + abono;
        System.out.println("Seu salário atualizado é: "+salarioNovo);
        System.out.println("---------------------------------");

    }
}
