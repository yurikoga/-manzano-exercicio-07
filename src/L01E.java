import java.util.Scanner;
/**
 * <h2>Cálculo de Prestação em Atraso</h2>
 * <p>
 * Esta classe efetua o cálculo e a apresentação do valor de uma prestação em atraso.
 * </p>
 * <p>
 * <b>Fórmula utilizada:</b><br>
 * <code>PRESTACAO = VALOR + (VALOR * (TAXA / 100) * TEMPO)</code>
 * </p>
 */

public class L01E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float[]valores=new float[5];
		System.out.println("\n---PROGRAMA CALCULO DE PRESTAÇÃO EM ATRASO---");
		System.out.println("DIGITE O VALOR DA PRESTAÇÃO:");
		valores[0]=sc.nextFloat(); // valor da prestação
		System.out.println("DIGITE A TAXA:");
		valores[1]=sc.nextFloat(); // taxa cobrada
		valores[3]=valores[1]/100f; // porcentagem
		System.out.println("DIGITE O PERÍODO DE ATRADO");
		valores[2]=sc.nextFloat(); // período em atraso
		//fórmula utilizada
		valores[4]=valores[0]+valores[0]*valores[3]*valores[2];
		System.out.printf("VALOR A SER PAGO:\n\tR$%.2f\n",valores[4]);
	}
}
