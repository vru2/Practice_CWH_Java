package Code_With_harry;

public class childInterface implements mainInterface{

    public void show(){
        System.out.println("Child interface");
    }

    public void display(){
        System.out.println("Displaying.....");
    }

    public static void main(String[] args) {
         childInterface ci = new childInterface();
         ci.show();
         ci.display();
    }
}
