package PROJECT221005_김주훈;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz6_7_1 {
    public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String a = sc.nextLine();
			if(a.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(a, " ");
			int n = st.countTokens();
			System.out.println("어절 개수는 "+ n);
		}
        sc.close();
	}
}
