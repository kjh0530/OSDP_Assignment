//예제 5-1
package PROJECT221005_김주훈;

class Point {
    private int x, y; // 한점을구성하는x, y 좌표
    public void set(int x, int y) {
    this.x= x; this.y= y;
    }
    public void showPoint() { // 점의좌표출력
    System.out.println("(" + x + "," + y + ")");
    }
}
class ColorPoint extends Point {
        private String color; //점의색
        public void setColor(String color) {
        this.color = color;
        }
        public void showColorPoint() { //컬러점의 좌표출력
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
        }
}
public class ColorPointEx {
    public static void main(String [] args) {
        Point p = new Point(); // Point 객체생성
        p.set(1, 2); // Point 클래스의set() 호출
        p.showPoint();
        ColorPoint cp= new ColorPoint();// ColorPoint객체
        cp.set(3, 4); // Point의set() 호출
        cp.setColor("red"); // ColorPoint의setColor() 호출
        cp.showColorPoint(); // 컬러와좌표출력
        }
}
