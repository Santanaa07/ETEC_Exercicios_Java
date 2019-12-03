package Vetor;

import java.util.Scanner;

public class H_Somatorio {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, j, a[], b[], fatorial=0;
		a = new int [10];
		b = new int [10];		
		
		for(i=0; i<10; i++) {
			System.out.print("Entre com o "+(i+1)+"º número: ");
			a[i] = in.nextInt();
		}
		for(i=0; i<10; i++) {
			for(j=a[i]; j!=0; j--) {
				fatorial=fatorial+j;
				b[i]= fatorial;
			}
			fatorial=0;
		}
		for(i=0; i<10; i++) {
			System.out.print("\nO Fatorial do "+(i+1)+"º número é : "+ b[i]);
		}
		in.close();
	}

}