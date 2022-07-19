import java.math.*;
public class Square extends Figure {
    int length;
    public Square(int length,String color) {
        super(color);
        this.length = length;
    }

    public double getArea() {
return Math.pow(length,2);
    }

}
