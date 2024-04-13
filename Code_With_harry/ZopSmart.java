package Code_With_harry;

public class ZopSmart {

    public static void main(String[] args) {

        String str = "nitin";
        String rev = "";
        String sub ="";
        for(int i=0; i<str.length(); i++) {
            for (int j = i; j < str.length()+1; j++) {
                sub = str.substring(i,j);
                System.out.println(sub);

            }
        }
        for(int k=sub.length()-1; k>=0; k--){
            rev = rev + sub.charAt(k);

            if(sub.equalsIgnoreCase(rev)){
                System.out.println(rev +": Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
        }
    }
}
