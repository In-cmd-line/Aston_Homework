package Lession_6;

// создать класс Park с внутренним классом
public class Park {
    public class Attraction {
        public String mainInfo;
        public String timeOfWork;
        public int price;

        public Attraction() {
            mainInfo = "Новый аттракцион";
            timeOfWork = "Ежедневно с 12.00 до 17.00";
            price = 300;
        }
    }
}
