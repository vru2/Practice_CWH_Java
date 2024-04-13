package JavaProg;

class Employee{
    int id;
    String name;
    public void employeeDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
}

public class Custom_class {

    public static void main(String[] args) {
        System.out.println("This is my custom class");

        Employee vrushabh = new Employee();
        Employee DJ = new Employee();

        vrushabh.id = 10;
        vrushabh.name = "Vru";

        DJ.id = 15;
        DJ.name = "Dj";

        vrushabh.employeeDetails();
        DJ.employeeDetails();

    }
}
