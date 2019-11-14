import java.util.Scanner;

public class CalculoDeIMC1  {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String nombre;
	int pesoKg;
	double estaturaM;
	double imc; 

	System.out.println("         CALCULO DEL IMC");
	System.out.println("         ===============");

	System.out.print("Ingrese su nombre: ");
	nombre = System.console().readLine();
	System.out.print("Ingrese su peso en kg: ");
	pesoKg = sc.nextInt();
	System.out.print("Ingrese su estatura en metros: ");
	estaturaM = sc.nextDouble();


	imc = (pesoKg) / Math.pow(estaturaM, 2);

	System.out.println("\nEl inidce de masa corporal de " + nombre + " es igual a " + imc);




	}
}