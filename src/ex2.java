import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        double c , f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        c = sc.nextDouble();
        f = c * 9/5 + 32;
        System.out.printf("A temperatura convertida para Fahrenheit é de: %.2f", f);
    }
}