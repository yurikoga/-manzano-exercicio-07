import java.util.Scanner;
import java.lang.Math;

/**
 Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
 soma dos quadrados dos três valores lidos.  */
public class L01L {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]valores=new double[3];
		double[]quadrados=new double[4];
		char letra=65;
		System.out.println("\nDigite:");
		for (byte cont=0;cont< valores.length;cont++){
			System.out.printf("\t%d° termo %c:",(cont+1),letra);
			valores[cont]= sc.nextFloat();
			letra++;
			quadrados[cont]=Math.pow(valores[cont],2);
		}
		letra=65;
		System.out.println("\nQuadrados:");
		for (byte cont=0;cont<valores.length;cont++){
			System.out.printf("\tTermo %c: %.0f² -> %.0f\n",letra,valores[cont],quadrados[cont]);
			quadrados[3]+=quadrados[cont];
			letra++;
		}
		System.out.printf("\nA Soma dos quadrados dos três valores lidos é: %.0f\n\n",quadrados[3]);

	}
}
