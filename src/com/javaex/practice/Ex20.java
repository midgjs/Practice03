package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("  [숫자맞추기게임 시작]");
		System.out.println("=========================");
		int answer = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print(">>");
			int num = sc.nextInt();
			
			if(num<answer) {
				System.out.println("더 높게");
			} else if(num>answer) {
				System.out.println("더 낮게");
			} else if(num==answer) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				
				sc.nextLine(); // sc.int 다음 sc.line 쓰면 오류가 난다. --> 개행 문자 사용해서 오류 없애준다.
				String quitgame = sc.nextLine();
				
				if(quitgame.equals("y")) {
					System.out.println("=========================");
					System.out.println("  [숫자맞추기게임 종료]");
					System.out.println("=========================");
					break;
				} else if(quitgame.equals("n")){
					System.out.println("=========================");
					System.out.println("  [숫자맞추기게임 시작]");
					System.out.println("=========================");
					answer = (int)(Math.random()*100)+1;
				}
			}
			
			
		}
		
		sc.close();
	}

}
