package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int fac = 1;
		for(int i=1; i<=num; i++) {
			fac = fac*i;
		
			
		}
		System.out.println(fac);
		
		
		sc.close();
		
		
		
		
		
		
	}

}
