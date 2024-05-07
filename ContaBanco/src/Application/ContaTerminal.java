package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.UserData;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		UserData userdata = new UserData();
		
		System.out.println("Informe o numero da sua conta bancaria : ");
		userdata.accountNumber = sc.nextInt();
		System.out.println("Informe sua agencia : ");
		sc.nextLine();
		userdata.accountAgency = sc.nextLine();
		System.out.println("Informe seu nome : ");
		userdata.accountHolder = sc.nextLine();
		System.out.println("Informe valor de deposito : ");
		userdata.accountBalance = sc.nextDouble();
		
		System.out.println();
		System.out.println(userdata);

	}

}
