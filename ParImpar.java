import java.util.Scanner;

public class ParImpar {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);	
	int num;


	System.out.print("Ingrese un numero entero: ");
	num = sc.nextInt ();


	if (num % 2 == 0) {
		System.out.println("\nEl numero " + num + " es par."); 
	}
	else{
		System.out.println("\nEl numero " + num + " es impar.");
	}
}
}