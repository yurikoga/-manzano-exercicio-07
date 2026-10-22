import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
/**Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
 dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
 disponível com o usuário, para que seja apresentado o valor em moeda brasileira. */
public class L01J {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]termos={"Cotação atual do Dólar:","Quantidade disponível em Dólares:"};
		float[]valores=new float[3];
		String valor;
		System.out.println("\nDigite:");
		for (byte cont=0;cont< termos.length;cont++){
			System.out.printf("\t%s",termos[cont]);
			valores[cont]= sc.nextFloat();
		}
		NumberFormat formatacao = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		valores[2]=valores[0]*valores[1];
		valor=formatacao.format(valores[2]);
		System.out.printf("\t\tConversão para Reais: %s",valor);
	}
}
