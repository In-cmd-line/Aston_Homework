package Lession_5;

import static Lession_5.Task_1.printThreeWords;
import static Lession_5.Task_10.reverseArray;
import static Lession_5.Task_11.addNumInArr;
import static Lession_5.Task_12.changeArr;
import static Lession_5.Task_13.crossArr;
import static Lession_5.Task_14.arrReturn;
import static Lession_5.Task_2.chekSumSing;
import static Lession_5.Task_3.printColor;
import static Lession_5.Task_4.compareNumbers;
import static Lession_5.Task_5.checkSum;
import static Lession_5.Task_6.checkNumber;
import static Lession_5.Task_7.checkNumberPosNeg;
import static Lession_5.Task_8.printStrings;
import static Lession_5.Task_9.whatYear;
// проверка всех заданий
public class Main {
    public static void main (String [] args) {
        printThreeWords();
        chekSumSing();
        printColor();
        compareNumbers();
        checkSum(5, 6);
        checkNumber(10);
        checkNumberPosNeg(5);
        printStrings("in_cmd_line", 3);
        whatYear(2024);
        reverseArray();
        addNumInArr();
        changeArr();
        crossArr();
        arrReturn(10, 3);
    }
}
