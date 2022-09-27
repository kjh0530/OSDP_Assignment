//실습문제 3번
package PROJECT220921_김주훈;

import java.util.Scanner;
public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하시오>>");
        int a = scanner.nextInt();
        for (int i=0; i<a; i++) {
            for(int j=0; j<a-i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        scanner.close();
    }
    
}
