//예제 3-3 : a-z까지 출력
package PROJECT220921_김주훈;

public class DoWhileSample {
    public static void main (String args[]) {
        char c = 'a';
        do {
        System.out.print(c);
        c = (char) (c + 1);
        } while (c <= 'z');
    }
}
