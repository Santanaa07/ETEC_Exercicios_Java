package Vetor;
import java.util.Scanner;
public class D_Pares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i, j;
		int a [] = new int [10];
		int cont [] = new int [10];
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print("Entre com o "+(i+1)+"º número:");
			a[i] = in.nextInt();
		}
		
		for(i = 0 ; i < 10 ; i++) {
			if(a[i] % 2 == 0) {
			System.out.print("Elementos:"+a[i]+" - 0 ");
			for(j = 1 ; j <= a[i] ; j++) {
				if (a[i] % j==0) {	
					cont[i] = j;
					System.out.print(cont[i]+" ");
				}
			}
			}else {
				System.out.println("\nElementos:"+a[i]);
			}
		}
			
			
		in.close();
	}
}