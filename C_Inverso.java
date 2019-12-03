package Vetor;

import java.util.*;
public class C_Inverso {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int i, a[],b[];
		a = new int [10];
		b = new int [10];
		
		for(i=0; i<=9; i++) {
			System.out.println("Entre com o " +(i+1)+ "º número: ");
			a[i] = in.nextInt();
			b[i]=a[i];
		}
		System.out.print("\nOs valores invertidos são: ");
		for(i=9; i>=0; i--) {
			System.out.print(b[i]+" ");
		}
		in.close();

		
	}

}
