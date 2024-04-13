package Code_With_harry;

import java.util.HashMap;

public class Employee {

    void Emp1(int id,String name){

    }
    void Emp2(){
        int id=102;
        String name = "Sai";
        //int Salary = 15000;
    }

    //empname, id
    public static void main(String[] args) {

        Employee e = new Employee();


        HashMap<String,Employee> map = new HashMap<>();
        map.put("TCS",e);
        System.out.println("Emp details: "+map);
    }



}
