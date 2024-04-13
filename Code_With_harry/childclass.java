package Code_With_harry;

public class childclass extends mainAbstract{

    void start(){
        System.out.println("Start with key");
    }

    public static void main(String[] args) {
        childclass c = new childclass();
        c.start();
        c.display();
    }
}
