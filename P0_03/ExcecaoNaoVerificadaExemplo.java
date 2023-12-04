package PO_03;

public class ExcecaoNaoVerificadaExemplo {
	
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(obterElemento(array, 4));
    }

    public static int obterElemento(int[] array, int indice) {
       
        return array[indice];
    }
}
