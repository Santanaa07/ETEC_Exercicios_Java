package Vetor;
import java.util.*;
public class I_Intersecao {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int i, j, a[], b[], c[];
		a = new int [10];
		b = new int [10];
		c = new int [10];
		
		for(i=0; i<10; i++) {
			System.out.print("Entre com o "+(i+1)+"º elemento A: ");
			a[i]=in.nextInt();
		}
		
		for(j=0; j<10; j++) {
			System.out.print("Entre com o "+(i+1)+"º elemento B: ");
			b[j]=in.nextInt();
		}
		
		for(i=0; i<10; i++) {
				for(j=0; j<10; j++) {
					if(a[i]==b[j]) {
						c[i] = a[i];
				}
			}
		}
		System.out.println("\nA interseção dos conjuntos de A e B são: ");
		for(i=0; i<10; i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}
		in.close();
	}
}