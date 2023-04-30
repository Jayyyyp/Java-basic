package override;

public class Student extends Human {

	public String major;
	
	@Override
	public void introduce() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("전공 : "+major);
	}
}
