package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entre com o numero da sua conta : ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("entre com seu nome : ");
		String name = sc.nextLine();
		Account caixa = new Account(name,account);
		char repetir;
		char nRepetir;
		
		System.out.println("você quer fazer um deposito : y/N");
		repetir = sc.next().charAt(0);
		while(repetir != 'N') {
			System.out.println("qual o valor : ");
			double valor = sc.nextDouble();
			caixa.addValue(valor);
			System.out.println("você quer fazer um deposito : y/N");
			repetir = sc.next().charAt(0);
			}
			
			System.out.println("você quer retirar dinheiro : y/N");
			nRepetir = sc.next().charAt(0);
			while(nRepetir != 'N'){
				System.out.println("qual valor : ");
				double valor = sc.nextDouble();
				caixa.rmValue(valor);
				System.out.println("você quer retirar dinheiro : y/N");
				nRepetir = sc.next().charAt(0);
			}
			
			System.out.printf("seu nome é %s\n"
					+ "seu numero de conta é %d\n"
					+ "sua conta tem %.2f : "
					,caixa.getName(),caixa.getAccount(),caixa.getValue());
			
			sc.close();
			
		}
	}
