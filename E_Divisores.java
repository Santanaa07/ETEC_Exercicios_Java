package Vetor;
import java.util.Scanner;
public class E_Divisores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i, j, a[], cont [];
		a = new int [10];
		cont= new int [10];
		
		for(i=0; i<10; i++) {

			System.out.print("Entre com o " +(i+1)+ "º número: ");
			a [i] = in.nextInt();
	}
		for(i=0; i<10; i++) {
			System.out.print("\nOs divisores de "+a[i]+" são: ");
			for(j=1; j<=a[i]; j++) {
				if (a[i] % j==0) {	
					cont[i] = j;
					System.out.print(cont[i]+" ");
				}
			}
		}
		

		in.close();
	}

}