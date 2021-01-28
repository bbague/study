package day10;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("피라미드 층수를 입력하세요 : ");  
		int n = scanner.nextInt();
		
		for(int i=0; i<= n-1; i++) {
			for(int j=0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
