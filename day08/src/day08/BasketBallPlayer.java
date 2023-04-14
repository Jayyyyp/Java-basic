package day08;

public class BasketBallPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	
	public BasketBallPlayer(String n, int h, int a, int s){
		name = n;
		height = h;
		age = a;
		salary = s;
	}
	// showInfo를 만들어주세요
	// 호출시 위 4가지 요소를 콘솔에 찍어주기
	public void showInfo() {
		System.out.println("이름은 "+ name);
		System.out.println("키는 "+ height + "cm");
		System.out.println("나이는 "+ age);
		System.out.println("연봉은 "+ salary + "만 원");
	}
	// 덩크슛하기 기능
	public void dunkShoot() {
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		} else {
			System.out.println("골대에 안닿음..");
		}
	}
}
