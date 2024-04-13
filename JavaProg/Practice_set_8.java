package JavaProg;

class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing...........");
    }

    public void viberate(){
        System.out.println("viberating...........");
    }

    public void call(){
        System.out.println("calling...........");
    }
}

class Square{
    int n;

    public int area(){
        return n*n;
    }

    public int perimeter(){
        return 4*n;
    }
}

class Rectangle{
    int l;
    int b;

    public int area(){
        return l*b;
    }

    public int perimeter(){
        return 2*(l+b);
    }
}


public class Practice_set_8 {
    public static void main(String[] args) {
        Employee1 vrushabh = new Employee1();
        vrushabh.salary = 34253;
        System.out.println("The salary is: " + vrushabh.getSalary());
        vrushabh.setName("Vrushabh Gurjar");
        System.out.println(vrushabh.getName());

        Cellphone sumsung = new Cellphone();
        sumsung.ring();
        sumsung.call();
        sumsung.viberate();

        // Problem 3

        Square sq = new Square();
        sq.n = 5;
        System.out.println("Area of square is: " + sq.area());
        System.out.println("Perimeter of square is: " + sq.perimeter());

        // problem 4
        Rectangle R = new Rectangle();
        R.l = 4;
        R.b = 5;
        System.out.println("Area of Rectangle is: " + R.area());
        System.out.println("Perimeter of Rectange is: "+ R.perimeter());

    }

}
