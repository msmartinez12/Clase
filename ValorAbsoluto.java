import java.util.Scanner;

public class ValorAbsoluto {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero, valorAbs;

		System.out.print("Ingrese un numero");
		numero = sc.nextFloat ();

		if (numero < 0) {
			valorAbs = numero * -1;
		}  
		else {
			valorAbs = numero;
		}
		System.out.println("El valor absoluto del numero " + numero + " es " + valorAbs);
	}
}