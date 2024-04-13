package Code_With_harry;


class employee {
    int id;
    String name;

    public void details(){
        System.out.println("The id is "+id);
        System.out.println("The name is: "+name);
    }
}

public class customClass {
    public static void main(String[] args) {

        employee e = new employee();
        employee e2 = new employee();

        e.id = 11;
        e.name = "vru";
        e2.id =12;
        e2.name = "qwerty";

        e.details();
        e2.details();

    }
}
