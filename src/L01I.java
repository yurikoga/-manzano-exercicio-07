import java.util.Scanner;
import java.lang.Math;
/**
 * Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
 * segundo.
 * */

public class L01I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[]ident={'A','B'};
		double[]valores=new double[5];
		System.out.println("");
		for(byte cont=0;cont<ident.length;cont++){
			System.out.printf("Digite o valor %c:",ident[cont]);
			valores[cont]= sc.nextDouble();
		}
		valores[2]=Math.max(valores[0],valores[1]);
		valores[3]=Math.min(valores[0],valores[1]);
		valores[4]=Math.pow((valores[2]-valores[3]),2);
		System.out.printf("O quadrado da diferença de %.0f-%.0f é: %.0f\n",valores[2],valores[3],valores[4]);

	}
}
