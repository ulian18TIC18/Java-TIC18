package PO_03;

import java.util.Scanner;

public class ExcecaoVerificadaExemplo {
    public static void main(String[] args) {
        try {
            int resultado = dividirDoisNumeros();
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int dividirDoisNumeros() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }

        return numerador / denominador;
    }
}



