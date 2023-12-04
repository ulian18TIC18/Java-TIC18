package PO_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1);
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int encontrarMenorValor(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        int tamanhoAleatorio = 5;
        int valorMaximoAleatorio = 100;
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoAleatorio, valorMaximoAleatorio);

        // Unifica os arrays
        int[] arrayUnificado = new int[arrayUsuario.length + arrayAleatorio.length];
        System.arraycopy(arrayUsuario, 0, arrayUnificado, 0, arrayUsuario.length);
        System.arraycopy(arrayAleatorio, 0, arrayUnificado, arrayUsuario.length, arrayAleatorio.length);

        System.out.println("Array unificado: " + Arrays.toString(arrayUnificado));
        System.out.println("Soma dos elementos: " + calcularSoma(arrayUnificado));
        System.out.println("Maior valor: " + encontrarMaiorValor(arrayUnificado));
        System.out.println("Menor valor: " + encontrarMenorValor(arrayUnificado));
    }
}
