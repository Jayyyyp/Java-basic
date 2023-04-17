package final_.field;

public class Collector {
	
	// 참조형 변수를 가진 경우, 변수 자체의 주소는 final이지만,
	// 참조형 변수 내부 자료까지 바뀌지 않음을 보장하지 않는다.
	// 주소는 바뀌지 않으나, 배열 내부 자료 요소는 바뀔 수 있음
	final String[] stickers = {"피카츄", "꼬부기", "미뇽"};
	
	
}
