package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-i; j>=1; j=j-1) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
