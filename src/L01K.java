import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
 real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
 com o usuário, para que seja apresentado o valor em moeda americana. */
public class L01K {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]termos={"Cotação atual do Dólar:","Quantidade disponível em Reais:"};
		float[]valores=new float[2];
		String valor;
		System.out.println("\nDigite:");
		for (byte cont=0;cont< termos.length;cont++){
			System.out.printf("\t%s",termos[cont]);
			valores[cont]= sc.nextFloat();
		}
		NumberFormat formatacao = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		valor=formatacao.format(valores[1]/valores[0]);
		System.out.printf("\t\tConversão para Dólares: %s\n",valor);
	}
}
