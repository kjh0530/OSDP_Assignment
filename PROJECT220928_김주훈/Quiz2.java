//4장 실습문제 2번

package PROJECT220928_김주훈;

import java.util.Scanner;

class Grade {
    int a, b, c;
    
    Grade(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int average() {
        return (a+b+c)/3;
    }

}
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
    
}
