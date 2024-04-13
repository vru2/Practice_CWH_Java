package JavaProg;

public class Practice_Set_6 {
    public static void main(String[] args) {

        //problem 1, create array of 5 elements and calculate there sum
        // problem 2, calculate the average marks from the given marks
        System.out.print("Length of an array ");
        int [] ele = {23,34,54,43,56};
        System.out.println(ele.length);
        int sum = 0;
        int avg = 0;
        for (int i=0; i<5;i++){
            System.out.println(ele[i]);
            sum = sum + ele[i];
            avg= sum/ele.length;
        }
        System.out.println("Sum of the elements in the array is: "+sum);
        System.out.println("Average marks is: "+avg);

        // problem 3, add 2 matrices
        System.out.println("Printing the sum of 2 arrays ");
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,8,5},
                         {7,3,12}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int j=0; j< mat1.length;j++){
            for(int k=0; k<mat1[j].length;k++){
                System.out.format("Setting values for j=%d and k=%d ", j,k);
                System.out.println(" ");
                result[j][k] = mat1[j][k] + mat2[j][k];
            }
        }
        for (int j=0; j< mat1.length;j++){
            for(int k=0; k<mat1[j].length;k++){
                System.out.print(result[j][k] + " ");
                result[j][k] = mat1[j][k] + mat2[j][k];
            }
            System.out.println(" ");
        }

        // problem 4, swaping the elements in the array
        System.out.println("Reversing the array");
        int [] arr = {1,2,3,4,5,6};
        int l= arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int m=0; m<n; m++){
            temp = arr[m];
            arr[m] = arr[l-m-1];
            arr[l-m-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}
