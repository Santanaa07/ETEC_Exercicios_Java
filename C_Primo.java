package Vetor;
import java.util.Scanner;
public class C_Primo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int i, j, a[], cont [], quant = 0;
		a = new int [10];
		cont= new int [10];
		
		for(i=0; i<10; i++) {
			System.out.print("Entre com o " +(i+1)+ "º número:");
			a [i] = in.nextInt();
	}
		for(i=0; i<10; i++) {
			for(j=1; j<=a[i]; j++) {
				if (a[i] % j==0) {	
					cont[i]++;
				}
			}
		}
		
		for(i=0; i<10; i++) {
			if(cont[i] == 2) {
				quant++;
				System.out.println("\n"+a[i]+" é um número primo!");
			}else {
				System.out.println("\n"+a[i]+" não é um número primo!");
			}
		}
		in.close();
	}
}