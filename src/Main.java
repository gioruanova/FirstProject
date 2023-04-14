import java.util.*;

class UserInputDemo {
    public static void main(String[] args) {
        int exchangeRate = 390;
        System.out.println("Bienvenido al conversor de tipo de cambio en U$S");

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Ingrese el valor en usd que desea convertir a pesos");
        int amountToConvert = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Ingrese su sueldo en pesos");
        int amountByMonth = sc2.nextInt();

        float finalConvesion = amountToConvert * exchangeRate;

        System.out.println("Total= $" + finalConvesion);

        if (amountByMonth == finalConvesion){
            System.out.println("Ok, podes comprarlo pero quedas justito");
        } else if (amountByMonth > finalConvesion) {
            System.out.println("Compra tranqui que te sobra plata");
        } else{
            System.out.println("Si te lo compras, comes arroz");
        }


    }
}