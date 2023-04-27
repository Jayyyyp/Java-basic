package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLoginQuiz {

	public static void main(String[] args) {

		/*
		 * <로그인 입력 값 검증>
		 * 
		 * 1. 입력받은 아이디가 맵에 입력된 키값에
		 *    해당하는지의 여부를 검사하여(containsKey 메서드 활용)
		 * 2. 맞다면 다시 한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 * 	  "로그인 성공"을 콘솔에 출력하고 반복문을 탈출
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다."를 출력
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면,
		 * 	  "아이디가 존재하지 않습니다." 출력
		 * 
		 * 문제 : Scannner를 이용해서 아이디와 비밀번호를 입력받으면
		 * 	     미리 생성된 HashMap에 저장한다.
		 *       그리고 입력이 완료되면 ID와 PW를 다시 물어봐서
		 *       로그인 입력값 검증대로 수행하도록 코드를 만들어라.
		 */
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> logIn = new HashMap<>();
		
		System.out.println("회원 가입 절차");
		System.out.println("ID를 입력해주세요.");
		String id = scan.nextLine(); // 회원가입할 ID 입력
		
		System.out.println("PW를 입력해주세요.");
		String pw = scan.nextLine(); // 회원가입할 PW 입력
		
		logIn.put(id, pw); // 주어진 키와 값을 추가
		
		while(true) {
			System.out.println("회원가입한 ID와 PW로 로그인 해주세요.");
			System.out.println("ID :");
			id = scan.nextLine();
			
			System.out.println("PW : ");
			pw = scan.nextLine();
			
			if(!logIn.containsKey(id)) { // 로그인한 id가 회원가입한 로그인이 아니면,
				System.out.println("ID를 잘못 입력하셨습니다.");
				continue;
			}else if(!logIn.containsValue(pw)) { // id는 맞는데, 회원가입한 pw가 아니면,
					System.out.println("PW를 잘못 입력하셨습니다.");
					continue;
				}else {
					System.out.println("로그인되었습니다.");
					break;
				}
			
		}
		scan.close();

	}

}
