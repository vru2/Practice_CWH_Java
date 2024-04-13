package Code_With_harry;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

class emp{
    int salary;
    String name;

    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSalary() {
        return salary;
    }
}

class cellphone{

    String ring;
    String viberate;

    public String ring(){
        return ring;
    }

    public String vib(){
        return viberate;
    }
}

class square{
    int a;

    public int area(){
        int c = 1;
        c = a*a;
        return c;
    }

    public int perimeter(){
        int d = 1;
        d = 4*a;
        return d;
    }
}

public class practice7 {
    public static void main(String[] args) {

        emp e = new emp();
        e.setName("Qwerty");
        e.salary= 12;
        System.out.println(e.getName());
        System.out.println(e.getSalary());

        cellphone cell = new cellphone();
        cell.ring = "Ringing";
        cell.viberate="Viberating";
        System.out.println(cell.ring());
        System.out.println(cell.vib());

        square sq = new square();
        sq.a =5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
