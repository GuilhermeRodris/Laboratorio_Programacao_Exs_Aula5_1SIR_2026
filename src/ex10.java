import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double convertido, quarto, terceiro, segundo, primeiro, bi;
        System.out.print("Digite a sequência de quatro dígitos formado por 0s e 1s: ");
        bi = sc.nextInt();

        //Divide a sequencia de digitos
        quarto = bi % 10;
        terceiro = (bi /10) % 10;
        segundo = (bi / 100) % 10;
        primeiro = bi /1000;

        //Converte os dígitos seguindo regra de conversão binaria
        //Garante que não existam restos para afetar a conta
        quarto = quarto * Math.pow(2,0) - (quarto * Math.pow(2,0) %1 );
        terceiro = terceiro * Math.pow(2,1) - (terceiro * Math.pow(2,1) %1 );
        segundo = segundo * Math.pow(2,2) - (segundo * Math.pow(2,2) %1 );
        primeiro = primeiro * Math.pow(2,3) - (primeiro * Math.pow(2,3) %1 );

        //Realiza a soma dos valores de transformados para chegar ao valor em base decimal
        convertido = quarto + terceiro + segundo + primeiro;

        System.out.println("O valor convertido do binário é: " + convertido);
    }
}
