package part3;

import java.sql.Array;

public class main {
    public static void main(String[] args) throws MyArraySizeException{
        String[][] array = {{"3", "2", "2", "1"}, {"ь", "2", "2", "1"}, { "2", "2", "1"}, {"3", "2", "2", "1"}};
        CalculateSumOfArray calculateSumOfArray = new CalculateSumOfArray();

        try {
            System.out.println("Сумма элементов в массиве = " + calculateSumOfArray.getSumOfArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
