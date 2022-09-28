//예제 4-10 멤버의 접근 지정자
package PROJECT220928_김주훈;

class Sample {
    public int a;
    private int b;
    int c;
}
public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 10;
        aClass.c = 10;
    }
}
