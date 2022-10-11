package PROJECT221005_김주훈;
interface Shape3{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle4 implements Shape3{
	private int radius;
	public Circle4(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + this.radius + "인 원입니다.");
	}
	public double getArea() {
		return PI * radius * radius;
	}
}

public class Quiz5_13 {
    public static void main(String args[]) {
		Shape donut = new Circle4(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
