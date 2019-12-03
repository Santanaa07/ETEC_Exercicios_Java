package Vetor;
import java.util.*;
public class L_Palindromos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i;
		int a [] = new int [10];
		int aux [] = new int [10];
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print("Entre com o "+(i+1)+"º número:");
			a[i] = in.nextInt();
			aux[i] = a[i];
		}
		
			if(a[0] == a[9] && a[1] == a[8] && a[2] == a[7] && a[3] == a[6] && a[4] == a[5]) {
				System.out.println("\nÉ um palíndromo!");
			}else {
				System.out.println("\nNão é um palíndromo!");
		}
		in.close();
	}
}
