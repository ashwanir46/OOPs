public class Ractangle {
    double width;
    double height;

    Ractangle() {
        width = 1;
        height = 1;

    }

    Ractangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    double getArea() {
        double area = width * height;
        return area;
    }

    double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}
