package PO_02;
import java.util.Scanner;

public class ConversorDeMoedas {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		
     
	        System.out.print("Insira a taxa de câmbio : ");
	        double taxaCambio = scanner.nextDouble();

	        
	        System.out.print("Insira a quantidade em dólares: ");
	        double quantidadeDolares = scanner.nextDouble();

	        
	        double valorConvertido = quantidadeDolares * taxaCambio;

	       
	        System.out.println("O valor convertido é: " + valorConvertido);
}
}