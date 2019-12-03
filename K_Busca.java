package Vetor;
import java.util.Scanner;
public class K_Busca {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i, b=0;
		int a [] = new int [10];
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print("Entre com o "+(i+1)+"º valor:");
			a[i] = in.nextInt();
			
		}
		
		System.out.print("\nEntre com o número a pesquisar:");
		b = in.nextInt();
		
		for(i = 0 ; i < 10 ; i++) {
			if(b == a[i]) {
				i++;
				break;
			}
		}
		
		if(i < 10 ) {
			System.out.println("Valor encontrado na "+i+"º posição");
		}else {
			System.out.println("Valor não encontrado!");
			
		}
		
		in.close();
	}
}