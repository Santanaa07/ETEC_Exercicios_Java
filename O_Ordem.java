package Vetor;
import java.util.Arrays;
import java.util.Scanner;
public class O_Ordem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		
		int a [] = new int [10]; 
		int b [] = new int [10]; 
		int c [] = new int [10]; 
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print("Entre com o "+(i+1)+"� n�mero:");
			a[i] = in.nextInt();
			b[i] = a[i];
			c[i] = a[i];
			System.out.println("");
		}
		
		System.out.print("N�meros: ");
		for(i = 0 ; i < 10 ; i++) {
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(b);
		System.out.print("\nN�meros em Ordem Crescente: ");
		for(i = 0 ; i < 10 ; i++) {
			System.out.print(b[i]+" ");
		}
		
		Arrays.sort(c);
		System.out.print("\nN�meros em Ordem Decrescente: ");
		for(i = 9 ; i > 0 ; i--) {
			System.out.print(c[i]+" ");
		}
		in.close();
	}

}
