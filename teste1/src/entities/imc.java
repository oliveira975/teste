package entities;

public class imc {
	public static double peso;
	public static double altura;
	public static char genero;
	
	 public static String imcGrau () {
		 String grau = null;
		 double massa = peso / Math.pow(altura,2);
		 switch(genero) {
		 case 'm' :
			 if (massa >= 18 && massa <= 25) {
				grau = "MASCULINO :NORMAL";
			 }else if (massa > 25 && massa <= 30) {
				 grau = "MASCULINO :SOBREPESO";
			 }else if (massa > 30 && massa <= 40) {
				 grau = "MASCULINO :OBESIDADE MODERADA";
			 }else {
				 grau = "MASCULINO :OBESIDADE GRAVISSÍMA";
			 }
			 break;
		 
		 case 'f' :
			 if (massa >= 18 && massa <= 26) {
				 grau = "FEMININO :NORMAL";
			 }else if (massa > 26 && massa <= 30) {
				 grau = "FEMININO :SOBREPESO";
			 }else if (massa > 30 && massa <= 40) {
				 grau = "FEMININO :OBESIDADE MODERADA";
			 }else {
				 grau = "FEMININO :OBESIDADE GRAVISSÍMA";
			 }
			 break;
	 }
		 return grau ;
	}
}
