import java.util.Scanner;

/**
 * Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
 * quadrado da soma dos três valores lidos.
 */
public class L01M {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]valores=new double[4];
		double[]quadrados=new double[1];
		char letra=65;
		System.out.println("\nDigite:");
		for (byte cont=0;cont< valores.length-1;cont++){
			System.out.printf("\t%d° termo %c:",(cont+1),letra);
			valores[cont]= sc.nextFloat();
			letra++;
			valores[3]+=valores[cont];
		}
		quadrados[0]=Math.pow(valores[3],2);
		System.out.printf("\n\t%.0f + %.0f + %.0f = %.0f\n",valores[0],valores[1],valores[2],valores[3]);
		System.out.printf("\nO Quadrado da soma dos três valores lidos é: %.0f\n\n",quadrados[0]);
	}
}
