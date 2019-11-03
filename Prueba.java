public class Prueba {

	public static void main(String[] args) {
		int a = 4; //byte
		int b = 3;
		int c = 5;
		boolean resultado;

		resultado = (a > b + 2)& !(c + a == b * c );


		System.out.println("a = 4 ; b = 3; c = 5");
		System.out.println("\nEl resultado de (a > b + 2)& !(c + a = b * c ) es " + resultado);

	}
}