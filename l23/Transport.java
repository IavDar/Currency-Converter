package l23;

 public class Transport {

    protected int passengersCount;
     protected String model;
     protected int year;

     public Transport(int passengersCount, String model, int year) {
         this.passengersCount = passengersCount;
         this.model = model;
         this.year = year;
     }

     public void applySkill () {
         System.out.println("Может ездить");
     }
     public String toString() {
         return passengersCount + "  |  " + this.model + "  |  " + this.year ;
     }


}
