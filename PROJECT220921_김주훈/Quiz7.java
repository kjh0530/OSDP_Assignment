//실습문제 7번
package PROJECT220921_김주훈;

import java.util.Random;
public class Quiz7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int intArray[] = new int[10];
        int sum = 0;
        float aver;
        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i<intArray.length; i++) {
            intArray[i] = rand.nextInt(9)+1;
            sum += intArray[i];
            System.out.print(intArray[i] + " ");
        }
        aver = sum/intArray.length;
        System.out.print("\n평균은 " + aver);


    }
    
}
