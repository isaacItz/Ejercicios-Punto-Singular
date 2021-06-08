package modelo;

import java.util.Scanner;

public class Main {

	private static Scanner leer = new Scanner(System.in);
	private static String ERROR_IO = "Opcion Invalida";
	private static String MENU_PRINCIPAL = "Que quieres calcular?\n1.- area caudrado \n2.- Perimetro de un cuadrado\n3.- Volumen de un cubo\n"
			+ "4.- Perimetro de un cubo \n5.- Volver a ingresar lado\n6.- Salir";
	private static String MENU_SECUNDARIO = "1.-realizar otro calculo\n2.-ingresar un nuevo dato\n3.-salir";

	public static void main(String[] args) {

		Cuadrado mycuadrado = new Cuadrado();
		Cuadrado myCubo = new Cubo();
		int lado;
		int op;
		do {

			do {
				System.out.println("Ingrese un lado para el cuadrado/cubo");
				lado = leer.nextInt();
				System.err.println(lado < 1 ? "Escribe un valor arriba de cero" : "");
			} while (lado < 1);

			mycuadrado.setl(lado);
			myCubo.setl(lado);
			int op2;

			do {
				System.out.println(MENU_PRINCIPAL);
				op = leer.nextInt();
				switch (op) {
				case 1:
					do {
						System.out.println("El area del cuadrado con medida de " + lado + " x lado es: "
								+ mycuadrado.calcularArea());
						System.out.println(MENU_SECUNDARIO);
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op = 5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println(ERROR_IO);
							break;
						}
					} while (op2 < 1 || op2 > 3);
					break;
				case 2:
					do {
						System.out.println("El perimetro del cuadrado con medida de " + lado + " x lado es "
								+ mycuadrado.calcularPerimetro());
						System.out.println(MENU_SECUNDARIO);
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op = 5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println(ERROR_IO);
							break;
						}
					} while (op2 < 1 || op2 > 3);
					break;
				case 3:
					do {
						System.out.println("El volumen del cubo con medida de " + lado + " x lado es: "
								+ ((Cubo) myCubo).calcularVolumen());
						System.out.println(MENU_SECUNDARIO);
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op = 5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println(ERROR_IO);
							break;
						}
					} while (op2 < 1 || op2 > 3);
					break;
				case 4:
					do {
						System.out.println("El perimetro del cubo con medida de " + lado + " x lado es: "
								+ myCubo.calcularPerimetro());
						System.out.println(MENU_SECUNDARIO);
						op2 = leer.nextInt();
						switch (op2) {
						case 1:
							break;
						case 2:
							op = 5;
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.err.println(ERROR_IO);
							break;
						}
					} while (op2 < 1 || op2 > 3);
					break;
				case 5:
					break;
				case 6:
					System.exit(0);
					break;

				default:
					System.err.println(ERROR_IO);
					break;
				}
			} while (op != 5);
		} while (true);

	}

}
