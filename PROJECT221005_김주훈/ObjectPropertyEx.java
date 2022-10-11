//예제 6-1
package PROJECT221005_김주훈;

class OP_Point {
    int x, y;
    public OP_Point(int x, int y) {
    this.x= x;
    this.y= y;
    }
}

public class ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 클래스이름
        System.out.println(obj.hashCode()); // 해시코드값
        System.out.println(obj.toString()); // 객체를문자열로만들어출력
        System.out.println(obj); // 객체출력
    }
    public static void main(String [] args) {
        OP_Point p = new OP_Point(2,3);
        print(p);
    }
}
