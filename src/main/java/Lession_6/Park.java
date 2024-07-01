package Lession_6;

// создать класс Park с внутренним классом
public class Park {
    public class Attraction {
        public String mainInfo;
        public String timeOfWork;
        public int price;

        public Attraction(String mainInfo, String timeOfWork, int price) {
            this.mainInfo = mainInfo;
            this.timeOfWork = timeOfWork;
            this.price = price;
        }
    }
}
