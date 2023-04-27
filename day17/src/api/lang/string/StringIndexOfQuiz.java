package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {

		// 특정 문장을 스캐너로 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요. ");
		String input = scan.nextLine();
		
		// 입력받은 문장에서 조회할 단어 적기
		System.out.println("찾을 단어를 입력해주세요. " );
		String find = scan.next();
		System.out.println(input + "에서 " + find + "을(를) 찾습니다. ");
		
		scan.close();
		
		// 단어가 몇개 있는지 카운팅하고, 몇 번 인덱스에 각각 있는지 콘솔에 찍기
		
		int count = 0;
		int index = 0;

		  while ((index = input.indexOf(find, index)) != -1) {  // 없는 단어 조회시 -1 출력을 이용
	            count++;
	            System.out.println(find + "이 (가)" + index + " 번 인덱스에 있습니다.");
	            index += find.length();
	        }

	        System.out.println(count + "개의 " + find + " 이(가) 있습니다.");
	    }
	}

