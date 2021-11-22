package application;

import java.util.Scanner;

public class Montanha_russa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0, i=0;
		int N = sc.nextInt();
		int Amin = sc.nextInt();
		int Amax = sc.nextInt();
		while (i<N) {
		int alt = sc.nextInt();
		if(alt>=Amin && alt<=Amax) {
				count ++;
				
		}
		i++;
			
		}
		System.out.println(count);
		sc.close();
		
		//while(sc.hasNext()) {

	}

}
