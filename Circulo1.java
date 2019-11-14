import java.util.Scanner;

public class Circulo1  {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	double π;
	double radio;
	double diametro;
	double area; 
	double circunferencia;

	System.out.println("         Circunferencia y Area de un Circulo");
	System.out.println("               =========================");

	System.out.print("Ingrese el radio del circulo: ");
	radio = sc.nextDouble();

	π = 3.14;
	diametro = radio * 2;
	circunferencia = π * diametro;
	area = π * Math.pow(radio, 2);
 
 	System.out.println("La circunferencia del circulo es de " + circunferencia + " cm" + " y su area es de " + area + " cm^2");








}
}