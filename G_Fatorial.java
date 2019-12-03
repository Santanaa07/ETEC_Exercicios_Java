package Vetor;
import java.util.*;
public class G_Fatorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, j, a[], b[], fatorial=1;
		a = new int [15];
		b = new int [15];		
		
		for(i=0; i<15; i++) {
			System.out.print("Entre com o "+(i+1)+"º número: ");
			a[i] = in.nextInt();
		}
		for(i=0; i<15; i++) {
			for(j=a[i]; j!=0; j--) {
				fatorial=fatorial*j;
				b[i]= fatorial;
			}
			fatorial=1;
		}
		for(i=0; i<15; i++) {
			System.out.print("\nO Fatorial do "+(i+1)+"º número é : "+ b[i]);
		}
		in.close();
	}

}