package test.method1;

public class MethodTest1 {
	static void printHead(char c, int num) {
		//System.out.println("---------------------------------------------");
		for(int i = 0; i < num; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printHead('☆', 20);
		System.out.println("사용자 정의 메소드를 만들었습니다.");
		printHead('★', 20);
		System.out.println("사용자 정의 메소드를 호출하겠습니다.");
		printHead('♡', 26);
	}

}
