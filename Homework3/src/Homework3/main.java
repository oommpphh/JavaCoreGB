package Homework3;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
  doLesson_Fruits();
        System.out.println("---------------------------------------------");
        int nums[] = {1, 63, 44, 14, 33, 36};

        for (int t = 0; t < nums.length; t++)
            System.out.print(nums[t] + " ");
        System.out.println();

        int g = nums[4];
        nums[4] = nums[1];
        nums[1] = g;
        for (int t = 0; t < nums.length; t++) {
            System.out.print(nums[t] + " ");
        }
    }

    private static void doLesson_Fruits() {
        Box<apple> appleBox = new Box<apple>(1);
        Box<orange> orangeBox = new Box<orange>(1.5);
        Box<apple> appleBox2 = new Box<apple>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new orange());
            appleBox.addFruit(new apple());
            appleBox2.addFruit(new apple());
        }

        appleBox.addFruit(new apple());
        appleBox.addFruit(new apple());

        appleBox2.addFruit(new apple());


        System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Вес коробок - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }

    private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}