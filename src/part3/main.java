package part3;

import java.sql.Array;

public class main {
    public static void main(String[] args) throws MyArraySizeException{
        String[][] array = {{"3", "2", "2", "1"}, {"ь", "2", "2", "1"}, {"3", "2", "2", "1"}, {"3", "2", "2", "1"}};
        try {
            System.out.println("Сумма элементов в массиве = " + getSumOfArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getSumOfArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Введенный массив не размером 4х4");}
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке элемент ["+ i + "," + j + "] некорректный");
                }
            }
        }
        return sum;
    }
}
