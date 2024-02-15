package l23;

public class Bus extends Transport {

    protected int routeNumber;

        public Bus(String model, int year, int routeNumber) {
            super(40 , model, year);

            this.routeNumber = routeNumber;

        }

    public void applySkill () {
        System.out.println("может перевозить пассажиров по установленному маршруту");

    }
}
