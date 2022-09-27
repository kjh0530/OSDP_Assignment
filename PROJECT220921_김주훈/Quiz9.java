//실습문제 9번
package PROJECT220921_김주훈;

import java.util.Random;
public class Quiz9 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][4];
        Random rand = new Random();
        for(int i=0; i<intArray.length; i++) {
            for(int j=0; j<intArray[i].length; j++) {
                intArray[i][j] = rand.nextInt(9) + 1;
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    
}
