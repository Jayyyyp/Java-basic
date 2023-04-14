package example.override;

public class Programer extends Human {
	
	public int career;
	public String company;
	
	@Override
	public void 코딩하기() {
		System.out.println("경력 : " + career);
		System.out.println("직장 : " + company);
	}
	@Override
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println(company + "의 회사에 다니는 "+career+"년차 개발자입니다.");
	}
}
