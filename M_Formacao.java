package Vetor;
import java.util.Scanner;
public class M_Formacao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		int a [] = new int [10];
		int b [] = new int [10];
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print("Entre com o "+(i+1)+"º número:");
			a[i] = in.nextInt();
		}
		System.out.println(" ");
		
		
		for(i = 0 ; i < 10 ; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		
		System.out.println("Resultado: ");
		for(i = 0 ; i < 10 ; i++) {
			System.out.print(b[i]+" ");
		}
		in.close();
	}
}
