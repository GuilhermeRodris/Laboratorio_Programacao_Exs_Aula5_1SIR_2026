import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite um número de 3 dígitos: ");
        num = sc.nextInt();
        num = num /10 % 10;
        System.out.println("O valor da dezena é: " + num);


    }
}
