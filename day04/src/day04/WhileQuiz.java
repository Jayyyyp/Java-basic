package day04;

import java.util.Scanner;

public class WhileQuiz {

    public static void main(String[] args) {

        /*
         * 컴퓨터와 스무고개 수 맞추기 프로그램
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("범위의 최댓값을 입력해주세요.");
        int maxValue = scan.nextInt();

        int computer = (int)(Math.random() * (maxValue + 1));
        int user = -1;
        int tries = 0;

        // 범위 내에서 유저의 값이 일치해야만 종료
        // 범위를 벗어난 값이 입력되면 다시 입력받도록 처리
        while (user < 0 || user > maxValue || computer != user) {
        	System.out.println("예상 숫자 입력");
            // 범위를 벗어난 경우 알림 출력
            if (user != -1 && (user < 0 || user > maxValue)) {
                System.out.println("잘못된 입력입니다. 범위 내에서 다시 입력해주세요.");
            }
            user = scan.nextInt();
            tries++;
            if (computer > user) {
                System.out.println("UP~");
                System.out.println("다시 입력해주세요.");
            } else if (computer < user) {
                System.out.println("DOWN~");
                System.out.println("다시 입력해주세요.");
            } else {
                System.out.println("----------------------");
            }
        }
        System.out.println("정답입니다. " + tries + "번만에 맞추셨습니다~~");
        scan.close();
    }
}
