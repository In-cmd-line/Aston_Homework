package Lesson_8;

// собственное исключение для иного размера
class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Неверный размер");
    }
}
