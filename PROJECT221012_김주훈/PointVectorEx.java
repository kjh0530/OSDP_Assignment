//예제 7-2
package PROJECT221012_김주훈;
import java.util.Vector;

class VTPoint {
    private int x, y;
    public VTPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        // VTPoint 객체를 요소로만 가지는 벡터 생성
        Vector<VTPoint> v = new Vector<VTPoint>();
        // 3 개의 VTPoint 객체 삽입
        v.add(new VTPoint(2, 3));
        v.add(new VTPoint(-5, 20));
        v.add(new VTPoint(30, -8));
        v.remove(1); // 인덱스 1의 VTPoint(-5, 20) 객체 삭제
        // 벡터에 있는 VTPoint 객체 모두 검색하여 출력
        for(int i=0; i<v.size(); i++) {
        VTPoint p = v.get(i); // 벡터에서 i 번째 VTPoint 객체 얻어내기
        System.out.println(p); // p.toString()을 이용하여 객체 p 출력
        }
        }
}
