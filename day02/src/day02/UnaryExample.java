package day02;

public class UnaryExample {

	public static void main(String[] args) {

		// 증감연산자 ++, --
		int i = 1;
		int j = i++; // 후위연산자는 먼저 해당코드를 수행하고, 뒤늦게 연산자 로직을 수행
		// int j=i를 먼저 수행하고,(i=1)
		// i++를 수행해 1을 더함(i=2)
		// j=1
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------");
		
		int x = 1;
		int y = ++x; // 전위연산자는 먼저 연산자 로직 수행 후, 해당코드를 수행
		// ++x를 수행해 x에 1을 더함(x=2)
		// int y=x(x=2인 상태이므로, y에도 2 대입)
		// 따라서, x=2, y=2
		System.out.println(x);
		System.out.println(y);
		
	}

}
