package l23;

public class Car extends Transport {

    protected int doorsNumber;

        public Car(String model, int year, int doorsNumber ) {
            super(5 , model, year);

            this.doorsNumber = doorsNumber;

        }

    public void applySkill () {
        System.out.println("паркуется в подземном гараже");

    }


}
