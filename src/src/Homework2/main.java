package Homework2;

public class main {
    public static void main(String[] args) {
        String[][] strings = createArray();
        //strings[2][3]="K";
        ArrayCheck arrayCheck = new ArrayCheck();
        arrayCheck.setStrings(strings);

        arrayCheck.summ();
    }

    private static String[][] createArray() {
        String[][] array = new String[4][4];
        //String[][] array = new String[5][5];
        for (int i = 0; i < array.length; i++,System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int)(Math.random() * 10));
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }
}
