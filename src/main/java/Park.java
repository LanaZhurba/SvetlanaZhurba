package main.java;

public class Park {
    private String namePark;
    private String workTimePark;

    public Park (String namePark, String workTimePark) {
        this.namePark = namePark;
        this.workTimePark = workTimePark;
    }

    public class Attraction {
        private String nameAttraction;
        private int priceTicket;
        private String workTime;

        public Attraction (String nameAttraction, int priceTicket, String workTime){
            this.nameAttraction = nameAttraction;
            this.priceTicket = priceTicket;
            this.workTime = workTime;
        }

    }
}
