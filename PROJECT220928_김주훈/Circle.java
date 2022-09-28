//예제 4-1 Circle 클래스의 객체 생성 및 활용
package PROJECT220928_김주훈;

public class Circle {
    int radius;
    String name;

    public Circle() { }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
    }
}
