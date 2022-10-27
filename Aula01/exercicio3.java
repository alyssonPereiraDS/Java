package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float adNoturno, horasExtras, salarioliquido, desconto, salarioBruto;
        System.out.println("Informe o Salario Bruto:");
        salarioBruto = read.nextFloat();
        System.out.println("Informe o adicional Noturno:");
        adNoturno = read.nextFloat();
        System.out.println("Informe desconto:");
        desconto = read.nextFloat();
        System.out.println("Informe os horas extras:");
        horasExtras = read.nextFloat();
        salarioliquido = salarioBruto + adNoturno + (horasExtras * 5) - desconto;
        System.out.println("salario atualizado:"+ salarioliquido  );
    }
}
