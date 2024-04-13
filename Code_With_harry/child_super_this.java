package Code_With_harry;

public class child_super_this extends  parent_Super_this{

    int a= 20;

    void child(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void  main(String[] args) {
        child_super_this st = new child_super_this();
        st.child(30);

    }
}
