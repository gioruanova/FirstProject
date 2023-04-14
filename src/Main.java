import java.util.*;

class UserInputDemo {
    public static void main(String[] args) {
        int exchangeRate = 390;
        int amountToConvert;
        int salaryByMonth;
        float finalConvesion;
        float moneySubstraction;


        System.out.println("Bienvenido al conversor de tipo de cambio en U$S");

        System.out.println("======-o_O-======");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor en usd que desea convertir a pesos");
        amountToConvert = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese su sueldo en pesos");
        salaryByMonth = sc2.nextInt();

        finalConvesion = amountToConvert * exchangeRate;
        moneySubstraction = finalConvesion / salaryByMonth * 100;

        System.out.println("%" + moneySubstraction);


        System.out.println("============");
        System.out.println("Al tipo de cambio de: $" + exchangeRate + ", el valor en pesos es de $" + finalConvesion);


        System.out.println("============");

        if (moneySubstraction >= 100) {
            System.out.println("Enserio estas seguro?" + " (equivale al %" + moneySubstraction + " de tu sueldo)");
        } else if (moneySubstraction >= 85) {
            System.out.println("Si te lo compras, comes arroz por un tiempo. Vofi..." + " (equivale al %" + moneySubstraction + " de tu sueldo)");
        } else if ((moneySubstraction >= 60)) {
            System.out.println("Ok, podes comprarlo pero quedas justito" + " (equivale al %" + moneySubstraction + " de tu sueldo)");
        } else {
            System.out.println("Compra tranqui que te sobra plata" + " (equivale al %" + moneySubstraction + " de tu sueldo)");
        }
    }
}