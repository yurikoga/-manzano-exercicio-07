import java.util.Scanner;
/**<header>
 <h1>Cálculo de Consumo de Combustível</h1>
 </header>

 <main>
 <p>
 Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz <strong>12 Km por litro</strong>.
 </p>

 <p>
 Para obter o cálculo, o usuário deve fornecer:
 </p>
 <ul>
 <li>O tempo gasto (<var>TEMPO</var>)</li>
 <li>A velocidade média (<var>VELOCIDADE</var>) durante a viagem</li>
 </ul>

 <p>
 Desta forma, será possível obter a distância percorrida com a fórmula:
 <br>
 <code>DISTANCIA = TEMPO * VELOCIDADE</code>
 </p>

 <p>
 Possuindo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
 <br>
 <code>LITROS_USADOS = DISTANCIA / 12</code>
 </p>

 <p>
 Ao final, o programa deve apresentar os seguintes valores:
 </p>
 <ul>
 <li>Velocidade média (<var>VELOCIDADE</var>)</li>
 <li>Tempo gasto na viagem (<var>TEMPO</var>)</li>
 <li>Distância percorrida (<var>DISTANCIA</var>)</li>
 <li>Quantidade de litros utilizada na viagem (<var>LITROS_USADOS</var>)</li>
 </ul>
 </main>*/

public class L01D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n-- PROGRAMA DE CÁLCULO DE CONSUMO DE COMBUSTÍVEL --");
		double[] valores=new double[5];
		valores[0]=12d;
		System.out.printf("\nESPECIFICAÇÃO DO CARRO: %.0fKM/LITRO\n",valores[0]);
		System.out.println("\nDIGITE O TEMPO GASTO:");
		valores[1] = sc.nextDouble(); // tempo gasto
		System.out.println("DIGITE A VELOCIDADE MÉDIA:");
		valores[2]=sc.nextDouble(); // velocidade média
		valores[3]=valores[1]*valores[2]; // valores[3] -> Distancia
		valores[4]=valores[3]/valores[0]; // valores[4] -> litros_usados
		System.out.printf("\nRESULTADO:\n" +
				"\tVELOCIDADE MÉDIA: %.0fKm/h\n" +
				"\tTEMPO GASTO: %.2fH\n" +
				"\tDISTÂNCIA: %.2fKm\n" +
				"\tQUANTIDADE DE LITROS USADOS: %.2fL\n",valores[2],valores[1],valores[3],valores[4]);

	}
}
