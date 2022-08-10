public class Employee {
    // attribute
    String employname;
    int employeeCode;
    double salary;
    int age;
    String dob;

    //behavior
    public double employeeHike(double hikePercent){
        return salary + (salary * hikePercent /100 );
    }

    public void display(){
        System.out.println("employname = " + employname);
        System.out.println("employeeCode = " + employeeCode);
        System.out.println("salary = " + salary);
        System.out.println("age = " + age);
        System.out.println("dob = " + dob);
    }
}
