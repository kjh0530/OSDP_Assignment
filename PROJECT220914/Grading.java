//예제 2-12

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();
        if(score >= 90) //score 90 이상
            grade = 'A';
        else if(score >= 80) //score 80 이상 90 미만
            grade = 'B';
        else if(score >= 70) //score 70 이상 80 미만
            grade = 'C';
        else if(score >= 60) //score 60 이상 70 미만
            grade = 'D';
        else //score 60 미만
            grade = 'F';
        System.out.println("학점은" + grade + "입니다.");

        scanner.close();
    }
    
}
