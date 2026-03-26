import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dezena, centena, unidade;
        System.out.println("Digite um numero de 3 digitos: ");
        num = sc.nextInt();
        unidade = num % 10;
        dezena = num /10 % 10;
        centena = num / 100;
        num = unidade * 100 + dezena * 10 + centena;
        System.out.println("O número lido na ordem inversa é: " + num);

    }
}
