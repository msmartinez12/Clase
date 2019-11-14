import java.util.Scanner;

public class TiempoDescargaArchivo1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	

	    float vel_Mbps; 
	 	float tam_GB;
		float vel_MB_S;
		float tam_MB;
		float tiempo_descarga_m;

		System.out.println("Tiempo De Descarga Del Archivo");
		System.out.println("==============================");

		System.out.print("¿Cual es la velocidad en Mbps de su conexion a internet?: ");
		vel_Mbps = sc.nextFloat();
		System.out.print("¿Cual es el tamano en GB del archivo que va a descargar?: ");
		tam_GB = sc.nextFloat();

		//velocidad a mbs
		vel_MB_S = vel_Mbps / 8;

		//Convertir tamaño a Mb
		tam_MB = tam_GB * 1024;

		//Tiempo de descarga a minutos
		tiempo_descarga_m = tam_MB / vel_MB_S / 60;

		System.out.println("Si la velocidad es estable y efectiva, el tiempo de descarga deberia ser: " + tiempo_descarga_m + " minutos");

    }
}