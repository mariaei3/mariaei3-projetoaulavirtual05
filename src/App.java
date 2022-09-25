import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o metro: ");
        double metro = sc.nextDouble();

        double centi = metro * 100;

        System.out.println("Centímetros: " + centi);
    }
}
