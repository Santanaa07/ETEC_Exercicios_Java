package Vetor;

import java.util.Scanner;
public class D_MaiorMenor {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int i, a[], maior=0, menor=999999999;
		a =  new int [10];
		
				
		for (i=0; i<10; i++) {
			System.out.println("Entre com o " +(i+1)+ "º número: ");
			a[i]=in.nextInt();
		}
		for(i=0; i<10; i++) {
			if(menor > a[i]) {
				menor = a[i];
			}
			if(maior < a[i]) {
				maior = a[i];
			}
		}
	System.out.println("\nO maior valor é: "+maior+"\nO menor valor é: "+menor);
	in.close();
	}
}
