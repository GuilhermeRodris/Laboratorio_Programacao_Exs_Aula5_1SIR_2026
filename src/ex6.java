import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x para a equação: ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 0.5));

        System.out.printf("O valor de y é: %.2f", y);


    }
}
