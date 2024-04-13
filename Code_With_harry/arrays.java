package Code_With_harry;

public class arrays {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0]=100;
        marks[1]=101;
        marks[2]=103;
        marks[3]=106;
        marks[4]=110;
        System.out.println(marks[3]);

        int [] student = {2,3,4,5,6,7,8,9,21,25};
        for (int i =0; i< student.length; i++){
            System.out.println(student[i]);
        }
        for(int j= student.length-1; j>=0; j--){
            System.out.println(student[j]);
        }
        //for each loop
        for(int elements: student){
            System.out.println(elements);
        }

    }
}
