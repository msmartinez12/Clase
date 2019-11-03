import java.util.Scanner;

public class CompraDeArticulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float articulo1, articulo2, articulo3;
		double precioTotal;		
		double iva;

		System.out.println("Compra de Artículos");
		System.out.print("Ingrese el precio del primer articulo: ");
		articulo1 = sc.nextFloat();
		System.out.print("Ingrese el precio del segundo articulo: ");
		articulo2 = sc.nextFloat();
		System.out.print("Ingrese el precio del tercer articulo: ");
		articulo3 = sc.nextFloat();
		
		precioTotal=(articulo1 + articulo2 + articulo3);
		iva=(0.12);


		System.out.println("\nGracias por su compra\n");
		System.out.println("El total a pagar incluido el IVA es " + (precioTotal+precioTotal*iva));
		


	}
}