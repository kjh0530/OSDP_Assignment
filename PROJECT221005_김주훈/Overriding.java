//예제 5-6
package PROJECT221005_김주훈;

class Weapon {
    protected int fire() {
        return 1; // 무기는 기본적으로 한명만살상
    }
}
class Cannon extends Weapon {
    protected int fire() { // 오버라이딩
    return 10; // 대포는한번에 10명을살상
}

public class Overriding {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본무기의 살상능력은" + weapon.fire());
        weapon = new Cannon();
        System.out.println("대포의 살상능력은" + weapon.fire());
    }
}
