package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num%2==1) {
			for(int i=1; i<=num; i=i+2) {
				sum=sum+i;
			}
		} else {
			for(int i=2; i<=num; i=i+2) {
				sum=sum+i;
			}
		}
		System.out.println("결과값: " + sum);
		
		sc.close();
	}

}
