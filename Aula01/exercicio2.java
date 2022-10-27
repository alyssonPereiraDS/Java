package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	double media, nota=0;
	Scanner leia = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat(".0");

	for(int contador =0; contador < 4; contador++) {
	    System.out.print("Digite a " + (contador + 1) + "° nota: ");
       nota += leia.nextDouble();
    }

	media = nota/4;
	System.out.println("\nA media das notas e = "+ df. format(media));
    }

}
