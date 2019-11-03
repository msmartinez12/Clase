import java.util.Scanner;

public class MayorMenorEdad1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nac; 
		int act;
		int edad;
		String mn; 


		System.out.print("Ingrese su ano de naciomiento: ");
		nac = sc.nextInt ();

		System.out.print("Ingrese el ano actual: ");
		act = sc.nextInt ();


		edad = (act-nac);

		if (edad > 17) {
			mn= "mayor"; 
		}
		else {
			mn= "menor";
		}


		System.out.println("\nUsted tiene " + edad + " anos por lo tanto es " + mn + " de edad");



	}
}