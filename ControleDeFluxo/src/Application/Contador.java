package Application;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o priemiro numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Informe o segundo numero: ");
		int numero2 = sc.nextInt();
		
		try {
			
			contar(numero1,numero2);
			
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	
	static void contar(int numero1,int numero2) {
		if(numero1 > numero2) {
			throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro.");
		}else {
			int cont = 1;
			int contagem = numero2 - numero1;
			for(int i = 0 ; i < contagem ; i++) {
				System.out.println("Imprimindo o número " + cont );
				cont++;
			}
		}
		
	}
	

}
