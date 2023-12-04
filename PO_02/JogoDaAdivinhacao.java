package PO_02;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
