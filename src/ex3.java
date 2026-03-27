import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade, tempo, litros, km;

        System.out.print("Diga o tempo gasto em horas: ");
        tempo = sc.nextDouble();

        System.out.print("Indique a velocidade média: ");
        velocidade = sc.nextDouble();

        km = velocidade * tempo;
        litros = km * 10.5;

        System.out.printf("A quantidade de litros foi: %.2f", litros);


    }
}