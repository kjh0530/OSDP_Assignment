//4장 실습문제 4번
package PROJECT220928_김주훈;

class Rectangle {
    private int x, y, width, height;

    public
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square() {
        return width*height;
    }

    void show() {
        System.out.print("("+ x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형\n");

    }

    boolean contain(Rectangle r) {
        if((this.x<r.x) && (this.y<r.y) && (this.x+this.width)>(r.x+r.width) && (this.y+this.height)>(r.y+r.height)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contain(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contain(s)) System.out.println("t는 s를 포함합니다.");       
    }
    
}
public class Quiz4 {
    
}
