import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        int[] arbitraryArray = {93, 32, 45, 65, 132, 23, 167, 55};

        System.out.println("Задание 2");

        System.out.print(integers[0] + ", ");
        System.out.print(integers[1] + ", ");
        System.out.println(integers[2]);

        System.out.print(fractionalNumbers[0] + ", ");
        System.out.print(fractionalNumbers[1] + ", ");
        System.out.println(fractionalNumbers[2]);

        for (int i = 0; i < arbitraryArray.length; i++) {
            System.out.print(arbitraryArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");

        System.out.print(integers[2] + ", ");
        System.out.print(integers[1] + ", ");
        System.out.println(integers[0]);

        System.out.print(fractionalNumbers[2] + ", ");
        System.out.print(fractionalNumbers[1] + ", ");
        System.out.println(fractionalNumbers[0]);

        for (int i = arbitraryArray.length - 1; i >= 0; i--) {
            System.out.print(arbitraryArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 4");

        for (int i = 0; i < integers.length;i++) {
            if (integers[i] % 2 != 0){
                integers[i]++;
            }
        }
        System.out.println(Arrays.toString(integers));
    }
}