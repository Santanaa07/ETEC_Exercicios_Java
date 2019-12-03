package Vetor;

import java.util.*;
public class B_Primos {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int i, j, a[], b[], quant=0, cont [];
		a = new int [10];
		b = new int [10];
		cont= new int [10];
		
		for(i=0; i<10; i++) {     //Leitura

			System.out.println("Entre com o " +(i+1)+ "º número: ");
			a [i] = in.nextInt();
	}
		for(i=0; i<10; i++) {       // Conta
			for(j=1; j<=a[i]; j++) {
				if (a[i] % j==0) {	
					cont[i]++;
				}
			}
		}
		
		for(i=0; i<10; i++) {       //Verificacao
			if(cont[i] == 2) {
				b[i]=a[i];
				quant++;
			}
		}
		
		
		System.out.println("\nHá "+quant+" números primos.\nSão eles:");
		for(i=0; i<10; i++) {
			if(b[i] != 0) {
				System.out.print(b[i]+" ");
			}else
				System.out.print("");
		}
		in.close();
	}
}