package part3;

import java.util.Arrays;

public class CalculateSumOfArray{

    protected int getSumOfArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        for (String a[] : arr) { // проверка непрямоугольного двумерного массива
            if (arr.length != 4 || a.length != 4) {
                throw new MyArraySizeException("Введенный массив не размером 4х4");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
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
