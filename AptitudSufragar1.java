import java.util.Scanner;

public class AptitudSufragar1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);	

	int nac; 
	int act;
	int edad; 


		System.out.print("Ingrese su ano de nacimiento: ");
		nac = sc.nextInt ();

		System.out.print("Ingrese el ano actual: ");
		act = sc.nextInt ();


		edad = (act-nac);

		if (edad < 16) {
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto no pude votar"); 
		}
		else if (edad < 18) {
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto su voto es opcional");
		}

		else if (edad > 65) {
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto su voto es obligatorio");
		}

		else {
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto su voto es opcional");	
		}

		
	}
}