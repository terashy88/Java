package testjava;

public class UserInput {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("  +------+");
		System.out.println(" /      /| h");
		System.out.println("+------+ +");
		System.out.println("|      |/  l");
		System.out.println("+------+");
		System.out.println("   b" + "\n");

		System.out.println(" Bitte geben Sie die Länge an!\n ");
		String länge = System.console().readLine();
		System.out.println(" Bitte geben Sie die Breite an!\n");
		String breite = System.console().readLine();
		System.out.println(" Bitte geben Sie die Höhe an!\n");
		String höhe = System.console().readLine();
		double l = "0.0+ länge";
		double b = ("0.0+ breite ");
		double h = ("0.0+ höhe");

		System.out.println("l*b*h");
	}
}
