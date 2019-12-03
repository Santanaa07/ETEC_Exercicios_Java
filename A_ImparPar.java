package Vetor;
import java.util.Scanner;
public class A_ImparPar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		int a [] = new int [20];
		int b [] = new int [20];
		
		for(i = 0 ; i < 20 ; i++) {
			System.out.println("Entre com o "+(i+1)+"º número.");
			a[i] = in.nextInt();
			b[i] = a[i];
			
		}
		
		System.out.print("\nNúmeros Pares:");
		for(i = 0 ; i < 20 ; i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.print("\nNúmeros Ímpares:");
		for(i = 0 ; i < 20 ; i++) {
			if(b[i] % 2 != 0) {
				System.out.print(b[i]+" ");
			}
		}
		
		in.close();
	}
}
