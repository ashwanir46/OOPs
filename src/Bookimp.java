public class Bookimp {
    public static void main(String[] args) {

        Book object = new Book();
        Book object1 = new Book();

        System.out.println("object.autherName = " + object.autherName);
        System.out.println("object.title = " + object.title);
        System.out.println("object.yearOfPublishing = " + object.yearOfPublishing);
        System.out.println("object.isbnNumber = " + object.isbnNumber);

        System.out.println("detail for the object1\n");

        System.out.println("object1.autherName = " + object1.autherName);
        System.out.println("object1.title = " + object1.title);
        System.out.println("object1.yearOfPublishing = " + object1.yearOfPublishing);
        System.out.println("object1.isbnNumber = " + object1.isbnNumber);

        System.out.println("change the value of year of publishing for object1");

        object1.yearOfPublishing = 2010;
        System.out.println("object1.yearOfPublishing = " + object1.yearOfPublishing);
    }
}
