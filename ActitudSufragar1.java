import java.util.Scanner;

public class AptitudSufragar1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);	

		
	int edad;
	


		System.out.print("Ingrese su edad actual: ");
		nac = sc.nextInt ();


		

		if (edad < 16) {
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto no pude votar"); 
		}
		else if (edad > 16){
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto su voto es opcional");
		}

		else (edad > 18){
			System.out.println("\nUsted tiene " + edad + " anos por lo tanto su voto es obligatorio");
		}
		

	}
}