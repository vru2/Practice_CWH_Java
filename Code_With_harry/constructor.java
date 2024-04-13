package Code_With_harry;

import org.w3c.dom.ls.LSOutput;

class MyEmployee{

    private int s;

    public int MyEmployee(int salary){
        //salary = 12000;
        return salary;
    }
    public void MyEmployee(){
        s = 12000;

    }
}

class Animal{
    public void animals(){
        System.out.println("I am animal class");
    }

    Animal(){
        System.out.println("I am animal constructor");
    }
}

class Dog extends Animal{
    public void dogs(){
        System.out.println("This is a dog");
    }

    Dog(){
        System.out.println("I am dog Constructor");
    }
}


public class constructor {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();
        System.out.println(emp.MyEmployee(3000));

        Dog d = new Dog();
        d.dogs();
        d.animals();


    }
}
