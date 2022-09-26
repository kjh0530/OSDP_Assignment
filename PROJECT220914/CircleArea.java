//예제 2-2

public class CircleArea {

    public static void main(String[] args) {
        final double PI = 3.14; //원주율을 상수로 표현

        double radius = 10.0; //원의 반지름
        double circleArea = radius*radius*PI;
        //원의 면적 계산
        
        System.out.println("원의 면적 = " + circleArea);
        //원의 면적 출력
    }
    
}
