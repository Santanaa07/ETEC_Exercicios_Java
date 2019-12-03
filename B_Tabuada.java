package Vetor;
import java.util.Scanner;
public class B_Tabuada {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i, j, aux = 0;
		int a [] = new int [5];
		
		for(i = 0 ; i < 5 ; i++) {
			System.out.print("Entre com os números à calcular:\n");
			a[i] = in.nextInt();
		}
		
		for(i = 0 ; i < 5 ; i++) {
			System.out.println("");
			for(j = 0 ; j <= 10 ; j++) {
				aux = a[i]*j;
				System.out.println(a[i]+" x "+j+" = "+aux);
			}
		}
		in.close();
	}
}
