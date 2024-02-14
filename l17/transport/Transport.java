package l17.transport;

 public class Transport {

     public int passengersCount;
     public String model;
     public int year;

     public Transport(int passengersCount, String model, int year) {
         this.passengersCount = passengersCount;
         this.model = model;
         this.year = year;
     }
     public String toString() {
         return passengersCount + "  |  " + this.model + "  |  " + this.year ;
     }


}
