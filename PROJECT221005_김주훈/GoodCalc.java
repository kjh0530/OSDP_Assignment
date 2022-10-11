//예제 5-7
package PROJECT221005_김주훈;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{
    @Override
    public int add(int a, int b){ // 추상메소드구현
        return a + b;
    }
    @Override
    public int subtract(int a, int b) { // 추상메소드구현
        return a - b;
    }
    @Override
    public double average(int[] a) { // 추상메소드구현
        double sum = 0;
        for (int i = 0; i <a.length; i++)
        sum += a[i];
        return sum/a.length;
    }
    public static void main(String [] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] { 2,3,4 }));
    }
}
