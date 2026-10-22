import java.util.Scanner;

/**
 * <h2>Operações Combinadas com Propriedade Distributiva</h2>
 * <p>
 * Ler quatro números inteiros (A, B, C e D) e efetuar as operações de adição e multiplicação
 * combinando todos os pares possíveis entre as variáveis (propriedade distributiva).
 * </p>
 * <p>
 * <b>Pares combinados:</b> (A,B), (A,C), (A,D), (B,C), (B,D) e (C,D).<br>
 * Total de 6 adições e 6 multiplicações, gerando 12 resultados de saída.
 * </p>
 */

public class L01G {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]valoresInseridos=new int[4];
		int[]soma=new int[6];
		int[]mult=new int[6];
		int contadoraExterna=0;
		char letra=65;
		System.out.println("\n---PROGRAMA DE OPERAÇÕES COMBINADAS COM PROPRIEDADE DISTRIBUTIVA---\n");
		for (byte cont=0;cont<valoresInseridos.length;cont++){
			System.out.printf("Digite o valor %c:",letra);
			valoresInseridos[cont]=sc.nextInt();
			letra++;
		}

		letra=65;
		for(byte contA=0;contA<valoresInseridos.length-1;contA++){
			System.out.println("\n"+letra);
			for(byte contB=(byte)(contA+1);contB<valoresInseridos.length;contB++){
				soma[contadoraExterna]=valoresInseridos[contA]+valoresInseridos[contB];
				System.out.printf("%d = %d soma %d\n",soma[contadoraExterna],valoresInseridos[contA],valoresInseridos[contB]);
			}
			for (byte contC=(byte)(contA+1);contC<valoresInseridos.length;contC++) {
				mult[contadoraExterna]=valoresInseridos[contA]*valoresInseridos[contC];
				System.out.printf("%d = %d multiplica %d\n",mult[contadoraExterna],valoresInseridos[contA],valoresInseridos[contC]);
			}
			contadoraExterna++;
			letra++;
		}
		sc.close();
	}
}
