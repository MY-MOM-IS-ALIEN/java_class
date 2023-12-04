package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //스캐너 점수를 하나 입력받아서
	   //90점 이상이면 A 80점 B 70점 C 60점 D
	   // 60점보다 적은점수면 F
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		
		int num = scanner.nextInt();
		String a = ""; 
		
		
		if(num < 0 || num > 100) {
		System.out.println("입력범위를 초과했습니다.");
		}else{
			if(90 <= num) {
				a = "A";
			}else if(80 <= num) {
				a = "B";
			}else if(70 <= num) {
				a = "C";
			}else if(60 <= num) {
				a = "D";
			}else{
				a = "F";
			}
		}
		System.out.println(a);
		
	}

}
