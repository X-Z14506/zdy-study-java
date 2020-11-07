/*
输出：
半径为1.0的圆的面积3.141592653589793
半径为1.0的圆的周长6.283185307179586
半径为25.0的圆的面积1963.4954084936207
半径为25.0的圆的周长157.07963267948966
半径为100.0的圆的面积31415.926535897932
半径为100.0的圆的周长628.3185307179587
31415.926535897932
*/

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("半径为"+circle1.radius+"的圆的面积"+circle1.getRadius());
        System.out.println("半径为"+circle1.radius+"的圆的周长"+circle1.getPerimeter());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("半径为"+circle2.radius+"的圆的面积"+circle2.getRadius());
        System.out.println("半径为"+circle2.radius+"的圆的周长"+circle2.getPerimeter());
        circle2.radius = 100;
        System.out.println("半径为"+circle2.radius+"的圆的面积"+circle2.getRadius());
        System.out.println("半径为"+circle2.radius+"的圆的周长"+circle2.getPerimeter());
        SimpleCircle circle3 = new SimpleCircle();
        circle3.setRadius(100);
        System.out.println(circle3.getRadius());
    }
}

class SimpleCircle {
    double radius;

    SimpleCircle() {
        this.radius = 1;
    }

    SimpleCircle(double newRadius) {
        this.radius = newRadius;
    }

    double getRadius() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
