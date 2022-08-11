public class RactangleImpl {
    public static void main(String[] args) {

        Ractangle obj1 = new Ractangle(4, 40);
        Ractangle obj2 = new Ractangle(3.5, 35.9);

        double area1 = obj1.getArea();
        double perimeter1 = obj1.getPerimeter();
        System.out.println("obj1.height = " + obj1.height);
        System.out.println("obj1.width = " + obj1.width);
        System.out.println("area = " + area1);
        System.out.println("perimeter = " + perimeter1);
        System.out.println("this value for the second constructor\n ");
        double area2 = obj2.getArea();
        double perimeter = obj2.getPerimeter();
        System.out.println("obj2.height = " + obj2.height);
        System.out.println("obj2.width = " + obj2.width);
        System.out.println("area2 = " + area2);
        System.out.println("perimeter = " + perimeter);
    }
}
