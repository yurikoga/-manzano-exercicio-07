import java.util.Scanner;

/**
 * <h2>Troca de Valores de Variáveis</h2>
 * <p>
 * Ler dois valores (inteiros, reais ou caracteres) para as variáveis <b>A</b> e <b>B</b>,
 * e efetuar a troca dos valores de forma que a variável <b>A</b> passe a possuir o valor
 * da variável <b>B</b> e a variável <b>B</b> passe a possuir o valor da variável <b>A</b>.
 * </p>
 * <p>
 * Apresentar os valores trocados ao final.
 * </p>
 */

public class L01F {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]valores=new String[2];
		String caixa;
		System.out.println("\n---PROGRAMA TROCA DE VALORES DE DE VARIAVÉIS---");
		for (byte i=0;i<valores.length;i++){
			System.out.printf("DIGITE O %d° VALOR:",(i+1));
			valores[i]=sc.nextLine();
		}
		System.out.printf("\tVáriavel A: %s\n",valores[0]);
		System.out.printf("\tVáriavel B: %s\n\n",valores[1]);
		// troca de valores
		caixa=valores[0];
		valores[0]=valores[1];
		valores[1]=caixa;
		System.out.printf("\tVáriavel A: %s\n",valores[0]);
		System.out.printf("\tVáriavel B: %s\n",valores[1]);
	}
}
