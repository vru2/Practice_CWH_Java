package Code_With_harry;

class circle{
    private int radius;

    public double area(){
        double a = 1;
        return a= 3.14*radius*radius;
    }

    public double circumference(){
        double circum = 1;
        return circum = 3.14*4*radius;
    }

    public double getRaduis(){
        return radius;
    }

    public void setRadius(int r){
        radius = r;
    }

}

public class getters_setters {
    public static void main(String[] args) {

        circle c = new circle();
        c.setRadius(5);
        System.out.println(c.getRaduis());
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}
