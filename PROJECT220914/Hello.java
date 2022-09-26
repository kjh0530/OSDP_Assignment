//예제 2-1
public class Hello {
	
	public static int sum(int n, int m) {//값 두 개를 받아 더해서 리턴하는 함수
		return n + m;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		//변수의 값들을 출력
	}
}