package principal;

import java.util.Scanner;
import entidade.Conversao;

public class Temperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conversao conv = new Conversao();
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		System.out.println("Convertido em Fahrenheit: " + String.format("%.2f", conv.conversao(celsius)) + "°F");
	}

}
