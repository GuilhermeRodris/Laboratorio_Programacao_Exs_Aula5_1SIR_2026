import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qui, valorq, precores, sm = 1.621;

        // a)
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        qui = sc.nextDouble();
        valorq = sm/7;
        System.out.printf("O valor de cada quilowatt é: R$ %.2f \n", valorq);

        //b)
        precores = valorq * qui;
        System.out.printf("O valor que a residência vai pagar é de: R$ %.2f \n", precores);

        precores = precores * 0.9;
        System.out.printf("O valor com desconto é: R$ %.2f", precores);
    }
}