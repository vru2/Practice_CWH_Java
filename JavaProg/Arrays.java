package JavaProg;

public class Arrays {
    public static void main(String[] args) {
        int [] marks;
        marks = new int[5];

        marks[0] = 45;
        marks[1] = 67;
        marks[2] = 76;
        marks[3] = 87;
        marks[4] = 90;
        System.out.println(marks[3]);
        System.out.println(marks.length);

        // Displaying array using for loop
        System.out.println("Displaying array elements using array");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Displaying array elements in reverse order using for loop
        int [] per = {23,56,65,34,67};
        System.out.println("length of the given array is "+ per.length);
        System.out.println("Displaying the array in the reverse order");
        for (int j=per.length-1; j>=0; j--){
            System.out.println(per[j]);
        }

        // Multi dimension array
        System.out.println("Multi dimension array");
        int [][] flats;
        flats = new int[2][3];

        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        System.out.println(flats[1][2]);

        // multi dimension array printing using for loop
        System.out.println("Printing multi dimension array using for loop");

        for (int k=0; k< flats.length;k++){
            for (int l=0; l<flats[k].length;l++){
                System.out.print(flats[k][l]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
