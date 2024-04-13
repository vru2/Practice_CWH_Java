package Code_With_harry;

public class practice2 {
    public static void main(String[] args) {
        //convert string to lower case
        String name = "Vrushabh";
        System.out.println(name.toLowerCase());
        String line = "Vrushabh is a good boy";
        System.out.println(line.replace(" ","_"));
        String letter = "Dear <1mame>!, Thanks a lot";
        System.out.println(letter.replace("<1mame>","Vrushabh"));
        String doubleTripe = "Vrushabh  is   a   good  boy";
        System.out.println(doubleTripe.contains("  "));
        System.out.println(doubleTripe.contains("   "));
        System.out.println(doubleTripe.indexOf("  "));
        System.out.println(doubleTripe.indexOf("   "));
        String words = "Dear Harry, This Java Course is nice: Thanks";
        System.out.println("Dear Harry\', This Java Course\\ is nice: Thanks");
    }
}
