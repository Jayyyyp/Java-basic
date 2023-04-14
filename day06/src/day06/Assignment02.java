package day06;

public class Assignment02 {

	public static void say(){
		System.out.println("과제 다했니?");
		System.out.println("집에 얼른 가자");
	}
	public static int Gob(int x, int y){
		return x * y;
	}
	public static void Sugo(String Hi){
		System.out.println(Hi + "그럼 이만~" );
	}
	
	public static void main(String[] args) {
		say();
		System.out.println(Gob(5,20) + "분 정도 걸릴거야");
		Sugo("수고요, ");
	}

}
