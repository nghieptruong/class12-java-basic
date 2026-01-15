package basic;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 5;
        intArray[2] = 6;
        intArray[3] = 7;
        intArray[4] = 2;
        System.out.println(intArray[1]); // 5

        System.out.println("-------------------");
        int[] myArray = {3, 4, 6, 9, 0, 3, 3};
        System.out.println(myArray[0]); // 3
        System.out.println(myArray[myArray.length-1]); // 3

        System.out.println("-------------------");
        //fori
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //for each
        System.out.println("-------------------");
        for(int num : myArray) {
            System.out.println(num);
        }

        System.out.println("------------------------");
        int[][] arr2D = new int[2][3];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;

        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;

        System.out.println(arr2D[0][1]);
        System.out.println("--------------------------");
        int row = arr2D.length;
        int col = arr2D[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }


    }
}
