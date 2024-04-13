//package Code_With_harry;
//
//public class Interview {
//
//// String sc = "({[]})[]" print invalid or not.
//    // String s = ([)] = invalid
//    // int arr= {1,2,2,3,4,5,5,5,7} print duplicate numbers and count
//
//    public static void main(String[] args) {
//
//        String sc = "({[]})[]";
//        for (int i =0; i<sc.length(); i++){
//
//            for(int j=0; j<sc.length();j++){
//                if(sc.charAt(i)==sc.charAt(j)&& i!=j){
//                    System.out.println();
//                }
//            }
//                if(sc.charAt(i)==sc.charAt(i+1)){
//                    System.out.println("Valid String");
//                }
//                else {
//                    System.out.println("Invalid string");
//                }
//
////        }
//
//        int []arr ={1,2,2,3,4,5,5,5,7};
//        int count =0;
//        for(int i=0; i<arr.length;i++){
//            for(int j =i+1; j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[j]);
//                    count++;
//                }
//            }
//
//        }
//        System.out.println("Total duplicate numbers: "+count);
//     String str = "abbabb";
//             String newstr = "";
//             char []ch = str.toCharArray();
//             for (int i=0; i<ch.length; i++){
//            newstr = newstr +ch[i];
//            System.out.println(newstr);
//
//            }
//            for(int j=1; j<ch.length; j++){
//            newstr = newstr +ch[j];
//            System.out.println(newstr);
//            }
//    }
//
//}
