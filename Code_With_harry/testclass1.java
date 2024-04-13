package Code_With_harry;

import javax.swing.*;
import java.util.HashMap;

public class testclass1 {

    public static void main(String[] args) {
        String [] arr = {"test", "abc", "vru","test"};
        int count;
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
            count = 1;
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[i] ="";
                }

            }if(count==1 && arr[i]!=""){
                System.out.println(arr[i]);
            }

        }

//        Action act = new Action(driver);
//        WebElement e = driver.findelementBy.xpath("elementxpath");
//        act.mousehover(e);



//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("test",2);
//        map.put("abc",1);
//        map.put("vru",1);
//
//        System.out.println(map);
    }


}
