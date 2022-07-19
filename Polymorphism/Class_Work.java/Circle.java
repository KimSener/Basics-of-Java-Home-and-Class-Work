import java.math.MathContext;
public class Circle extends Figure {
    int radius;

public Circle(int radius,String color) {
    super(color);
    this.radius = radius;
}
    public double getArea() {
return Math.PI * Math.pow(radius,2);
    }
    public double getPerimetr() {
        int length = 2;
        return 4 * length;
    }
}
