package Lession_6;

// класс сотрудник с заданными полями
public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String telNumber;
    public int salary;
    public int age;

    // конструктор для объекта с данными
    public Employee(String fullName, String position, String email, String telNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    // конструктор для самозаполнения объекта
    public Employee() {
        fullName = "Иоан Васильевич Грозный";
        position = "Царь";
        email = "CzarVseyaRusi@moscow.vr";
        telNumber = "+79112223344";
        salary = 70000;
        age = 50;
    }

    public void printData() {
        System.out.println("ФИО сотрудника: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Телефонный номер: " + telNumber);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }
}