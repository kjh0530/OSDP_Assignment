//실습문제 11번
package PROJECT220921_김주훈;

public class Quiz11 {
    public static void main(String[] args) {
        int sum = 0;
        int aver;
        for(int i=0; i<args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        aver = sum/args.length;
        System.out.print(aver);
        
    }
}
