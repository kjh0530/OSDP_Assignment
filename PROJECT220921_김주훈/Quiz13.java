//실습문제 13번
package PROJECT220921_김주훈;

public class Quiz13 {
    public static void main(String[] args) {
        for(int i=1; i<100; i++) {
            if(i<10){
                if(i == 3 || i== 6 || i == 9){
                    System.out.print(i + " 박수 짝\n");
                }
            }
            else {
                if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i/10 == 3 || i/10 == 6 || i/10 == 9) {
                    System.out.print(i + " 박수 짝\n");
                }
            }
        }
    }
}
