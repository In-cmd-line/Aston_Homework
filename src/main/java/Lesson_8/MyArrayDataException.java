package Lesson_8;

// собственное исключение для bad data
class MyArrayDataException extends RuntimeException {
    public MyArrayDataException() {
        super("Неверные данные");
    }
}
