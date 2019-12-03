package Vetor;
import java.util.Scanner;
public class N_Tamanhos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		int a [] = new int [5];
		int b [] = new int [5];
		int c [] = new int [5];
		
		for(i = 0 ; i < 5 ; i++) { //Entrada vetor A
			System.out.print("Entre com o "+(i+1)+"º valor do vetor A:");
			a[i] = in.nextInt();
		}
		System.out.println("");
		for(i = 0 ; i < 5 ; i++) { //Entrada vetor B
			System.out.print("Entre com o "+(i+1)+"º valor do vetor B:");
			b[i] = in.nextInt();
		}
		
		System.out.println("");
		System.out.print("Valores vetor A: ");
		for(i = 0 ; i < 5 ; i++) {
			System.out.print(+a[i]+" ");
		}
		System.out.println("");
		System.out.print("Valores vetor B: ");
		for(i = 0 ; i < 5 ; i++) {
			System.out.print(+b[i]+" ");
		}
		
		
		for(i = 0 ; i < 5 ; i++) { //Processamento
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if (a[i] == b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}

		System.out.println("");
		System.out.println("\nResultado: ");
		for(i = 0 ; i < 5 ; i++) { // Saída
			System.out.print(c[i]+" ");
		}
		in.close();
	}
}