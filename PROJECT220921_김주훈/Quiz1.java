//실습문제 1번
package PROJECT220921_김주훈;

public class Quiz1 {
    public static void main(String[] args) {
        int sum=0, i=0;
        while(i<100) {
            sum = sum + i;
            i += 2;
        } //2부터 98까지 짝수를 모두 더하는 코드
        System.out.println(sum);
    }
}
