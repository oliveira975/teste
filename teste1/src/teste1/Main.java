package teste1;
import java.util.Scanner;

import entities.imc;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("entre com seu peso e altura e genero :");
	 	imc.peso = sc.nextDouble();
	 	imc.altura = sc.nextDouble();
	 	imc.genero = sc.next().charAt(0);
	 	System.out.println(imc.imcGrau());
	 	
	 	
	sc .close();

	}

}
