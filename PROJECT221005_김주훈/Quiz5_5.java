package PROJECT221005_김주훈;
class Point2 {
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint2 extends Point2 {
	private String color;
	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY (int x, int y) {
		move(x, y);
	}
	public void setColor (String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

public class Quiz5_5 {
    public static void main(String args[]) {
		ColorPoint2 cp = new ColorPoint2(5, 5, "Yellow");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
