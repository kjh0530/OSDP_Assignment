//예제 6-3
package PROJECT221005_김주훈;

class EqPoint {
    int x, y;
    public EqPoint(int x, int y) {
        this.x= x; this.y= y;
    }
    public boolean equals(Object obj) {
        EqPoint p = (EqPoint)obj;
        if(x == p.x&& y == p.y) return true;
        else return false;
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        EqPoint a = new EqPoint(2,3);
        EqPoint b = new EqPoint(2,3);
        EqPoint c = new EqPoint(3,4);
        if(a == b) // false
            System.out.println("a==b");
        if(a.equals(b)) // true
            System.out.println("a is equal to b");
        if(a.equals(c)) // false
            System.out.println("a is equal to c");
    }
}
