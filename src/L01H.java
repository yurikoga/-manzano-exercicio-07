import java.util.Scanner;

/**
 * <h2>Cálculo do Volume de uma Caixa Retangular</h2>
 *
 * <p>Para calcular o volume de uma caixa retangular, utilize a seguinte fórmula:</p>
 *
 * <p>
 *   <code>VOLUME = COMPRIMENTO &times; LARGURA &times; ALTURA</code>
 * </p>
 */

public class L01H {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]medidas={"Comprimento","Largura","Altura"};
		float[]valorMedida=new float[4];

		System.out.println("\nDigite:");
		for(byte cont=0;cont<medidas.length;cont++){
			System.out.printf("\t%s da caixa:",medidas[cont]);
			valorMedida[cont]=sc.nextFloat();
		}
		valorMedida[3]=valorMedida[0]*valorMedida[1]*valorMedida[2];
		System.out.printf("O volume total da caixa é: %.2fcm²\n",valorMedida[3]);

	}
}
