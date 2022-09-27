//예제 3-1 for 문을 이용하여 1부터 10까지 합 출력

package PROJECT220921_김주훈;

public class ForSample {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++) {
            sum += i;
            System.out.print(i);

            if(i<=9)
            System.out.print("+");
            else {
                System.out.print("=");
                System.out.print(sum);
            }
        }

    }
    
}
