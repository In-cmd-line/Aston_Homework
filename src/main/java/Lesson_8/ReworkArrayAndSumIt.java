package Lesson_8;

public class ReworkArrayAndSumIt {
    public static void reworkArrayAndSumIt(String[][] arr) {
        System.out.println("----------------------------");
        System.out.println("Обработка массива:");
        try {
            System.out.println("Сумма всех элементов массива: " + checkErrors(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива отличается от 4х4.");
        } catch (MyArrayDataException e) {
            System.out.println("Преобразование невозможно.");
        }
        System.out.println("----------------------------");
    }

    public static int checkErrors(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 | arr[0].length != 4)
            throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В массиве неверные данные по адресу:");
                    System.out.println("строка - " + (i+1));
                    System.out.println("столбец - " + (j+1));
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
