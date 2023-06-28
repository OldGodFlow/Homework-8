import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] dataArray1 = new int[3];
        dataArray1[0] = 1;
        dataArray1[1] = 2;
        dataArray1[2] = 3;

        double[] dataArray2 = {1.57, 7.654, 9.986};

        double[] arbitrarySetArray = {81.556, 178566.3, 19819.32, 161, 7, 846};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] dataArray1 = new int[3];
        dataArray1[0] = 1;
        dataArray1[1] = 2;
        dataArray1[2] = 3;
        for (int i = 0; i < dataArray1.length; i++) {
            if (i == dataArray1.length - 1) {
                System.out.println(dataArray1[i]);
            } else {
                System.out.print(dataArray1[i] + ", ");
            }
        }

        double[] dataArray2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < dataArray2.length; i++) {
            if (i == dataArray2.length - 1) {
                System.out.println(dataArray2[i]);
            } else {
                System.out.print(dataArray2[i] + ", ");
            }
        }

        double[] arbitrarySetArray = {81.556, 178566.3, 19819.32, 161, 7, 846};
        for (int i = 0; i < arbitrarySetArray.length; i++) {
            if (i == arbitrarySetArray.length - 1) {
                System.out.println(arbitrarySetArray[i]);
            } else {
                System.out.print(arbitrarySetArray[i] + ", ");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] dataArray1 = new int[3];
        dataArray1[0] = 1;
        dataArray1[1] = 2;
        dataArray1[2] = 3;
        for (int i = dataArray1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(dataArray1[i] + ", ");
            } else {
                System.out.println(dataArray1[i]);
            }
        }

        double[] dataArray2 = {1.57, 7.654, 9.986};
        for (int i = dataArray2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(dataArray2[i] + ", ");
            } else {
                System.out.println(dataArray2[i]);
            }
        }

        double[] arbitrarySetArray = {81.556, 178566.3, 19819.32, 161, 7, 846};
        for (int i = arbitrarySetArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arbitrarySetArray[i] + ", ");
            } else {
                System.out.println(arbitrarySetArray[i]);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] dataArray1 = new int[3];
        dataArray1[0] = 1;
        dataArray1[1] = 2;
        dataArray1[2] = 3;
        for (int i = 0; i < dataArray1.length; i++) {
            if (dataArray1[i] % 2 != 0) {
                dataArray1[i]++;
            }
        }
        System.out.println(Arrays.toString(dataArray1));
    }
}