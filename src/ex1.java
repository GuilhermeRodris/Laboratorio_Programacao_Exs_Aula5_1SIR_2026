import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double area, altura, base, perimetro ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura do retângulo: ");
        altura = sc.nextDouble();

        System.out.print("Informe a base do retângulo: ");
        base = sc.nextDouble();

        area = base * altura;
        perimetro = (2 * base) + (2 * altura);

        System.out.printf("A área é do retângulo é de: %.2f", area);
        System.out.printf("O perímetro do retângulo é: %.2f", perimetro);

    }
}