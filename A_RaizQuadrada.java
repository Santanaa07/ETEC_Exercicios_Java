/*1)Criar um vetor A com 10 inteiros. Calcular e apresentar um vetor B onde cada elemento de B será a raiz quadrada do respectivo elemento de A;***/

package Vetor;
import java.util.Scanner;
public class A_RaizQuadrada {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		
		int a [] = new int [10];
		int b [] = new int [10];
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor a calcular:");
			a [i] = in.nextInt();
		}
		
		for(i = 0 ; i < 10 ; i++) {
			b[i] = (int) Math.sqrt(a[i]);
		}
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.println("\nA raiz de "+a[i]+" é: "+b[i]);
		}
		in.close();
	}
}

