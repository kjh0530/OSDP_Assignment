//예제 3-13 main()에서 명령행 인자의 합 계산
package PROJECT220921_김주훈;

public class Calc {
    public static void main (String[] args) {
        double sum = 0.0;
        for (int i=0; i<args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("합계 : "+ sum);
    }
}
