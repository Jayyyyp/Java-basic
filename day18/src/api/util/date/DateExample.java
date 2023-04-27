package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
		
	public static void main(String[] args) {
		// void 파라미터 호출시, 현재 시간
		Date date = new Date(); // java.util.Date import
		System.out.println(date);
		
		// 현재시간 이외의 시간으로 입력하는 경우
		Date date2 = new Date(122, 10, 9, 18, 30, 00); // 1900년부터 몇년이 지났는지로 입력해야함
		System.out.println(date2);
		
		// 날짜 양식 바꾸기
		// 1. SimpleDateFormat 객체를 생성하는데, 표현양식을 넣어 생성
		// 예시) 2023년 4월 20일 09분 28초 형식으로 양식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		// 2. sdf.format(Date 타입 변수); 를 넣어 콘솔에 찍기
		System.out.println(sdf.format(date));
		
		// 오늘은 X 요일입니다. 오늘은 1년중 Y번째 날입니다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다." );
		System.out.println(sdf2.format(date));
	}
}
