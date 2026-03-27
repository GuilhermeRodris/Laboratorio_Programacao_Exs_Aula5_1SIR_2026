
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double slm, sb, vha, nht, desINSS, pINSS;

        //a)
        System.out.print("Digite o valor da hora aula: ");
        vha = sc.nextDouble();
        System.out.print("Informe o número de horas trabalhadas: ");
        nht = sc.nextDouble();
        sb = vha * nht;
        System.out.printf("O salário bruto é: R$ %.2f \n", sb);

        //b)
        System.out.println("Informe qual a porcentagem de desconto do INSS" +
                " (Não é necessário adicionar o %):");
        pINSS = sc.nextDouble();
        desINSS = sb * (pINSS / 100);
        System.out.printf("Valor a ser descontado do salário bruto: %.2f \n", desINSS);

        //c) e d)
        slm = sb - desINSS;
        System.out.printf("O valor do salário liquido mensal é de: %.2f", slm);





    }
}