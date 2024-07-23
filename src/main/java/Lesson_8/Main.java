package Lesson_8;

public class Main {

    // нормальный массив
    public static void main(String[] args) {
        String[][] arrGood = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        // массив иной размерности (не 4х4)
        String[][] arrBad1 = {
                {"1", "1", "1"},
                {"2", "2", "2"},
                {"3", "3", "3"},
                {"4", "4", "4"}
        };

        // массив с bad data
        String[][] arrBad2 = {
                {"1", "1", "one", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        ReworkArrayAndSumIt.reworkArrayAndSumIt(arrGood);
        ReworkArrayAndSumIt.reworkArrayAndSumIt(arrBad1);
        ReworkArrayAndSumIt.reworkArrayAndSumIt(arrBad2);
    }
}