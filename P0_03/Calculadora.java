package PO_03;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public float dividir(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        try {
            int resultadoInteiro = calculadora.dividir(a, b);
            System.out.println("Resultado da divisão inteira: " + resultadoInteiro);

            float resultadoFloat = calculadora.dividir((float) a, (float) b);
            System.out.println("Resultado da divisão float: " + resultadoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

