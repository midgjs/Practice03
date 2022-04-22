package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("5의 배수의 개수: " + num/5);
		
		int sum = 0;
		for(int i=1; i<=num/5; i++ ) {
			sum = sum + 5*i;
		}
		System.out.println("5의 배수의 합: " + sum);
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
