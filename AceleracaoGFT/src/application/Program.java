package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int k = leitor.nextInt();
        int l = leitor.nextInt();
        
        if(k+1==l|| k-1==l) {
        	System.out.println("oitavas");
        }
        else if(k%2==0 && l%2==0){
            System.out.println("semifinal");
        }
        else if(k%2!=0 && l%2!=0) {
        	System.out.println("final");
        }
        else {
        	System.out.println("quartas");
        }
        leitor.close();

	}

}
