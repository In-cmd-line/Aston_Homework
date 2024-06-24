package Lession_6;


// создать массив сотрудников
public class ArrayOfEmployees {
    public static void createArr() {
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = new Employee("Дарт Вэйдэр Палпатинович", "Лорд Ситхов",
                "DarkSide@DeathStar.com", "+79527778899", 10000000, 45);
        arrEmployees[1] = new Employee("Колобок Дедулько Бабульевич", "Хавчик",
                "TheTrueSphere@village.ru", "+79630000000", 0, 0);
        arrEmployees[2] = new Employee("Дейнерис Таргариен", "Мать Драконов",
                "Khaleesi@drgn.vs", "+79542221188", 10000000, 22);
        arrEmployees[3] = new Employee("Гэндальф Олорин Митрандир", "Белый маг",
                "FrodoZadolbal@middleearth.md", "+79219998877", 0, 2000);
        arrEmployees[4] = new Employee("Бабайка Под Кроватью", "Домашний питомец",
                "booo@hata.ru", "+79457775533", 1, 38);

        // смотрим массив
        for (Employee i : arrEmployees) {
            i.printData();
            System.out.println();
        }
    }
}
