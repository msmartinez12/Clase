import java.util.Scanner;

public class CalculoIMC2 {
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
	
	System.out.println("--------------------------------------------");
	System.out.println("|Valor del IMC         |      Estado       |");
	System.out.println("|--------------------- |--------------------");
	System.out.println("|Menos de 18.49        | Infra Peso        |");
	System.out.println("|18.5 a 24.99          | Peso Normal       |");
	System.out.println("|30 a 34.99            | Sobre Peso        |");
	System.out.println("|35 a 39.99            | Obesidad Leve     |");
	System.out.println("|40 o mas              | Obesidad Media    |");
	System.out.println("|                      | Obesidad Morbida  |");
	System.out.println("--------------------------------------------");






	}
}
	
