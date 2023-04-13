// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

		int segundoNumero;
		int primerNumero;



        System.out.println("Ingrese numero a calcular");
        primerNumero = (new Scanner(System.in)).nextLine();
        System.out.println("Ingrese el segundo numero a calcular");
        segundoNumero = (new Scanner(System.in)).nextLine();

		int resultado = primerNumero + segundoNumero;
        System.out.println("el resultado es " + resultado);
    }
}