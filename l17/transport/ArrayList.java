package l17.transport;


public class ArrayList {



        private static int INITIAL_SIZE = 5;

        private Car[] data;

        private int count = 0;

        public ArrayList() {


                this.data = new Car[INITIAL_SIZE];

        }

        public void add(Car value) {
                data[count] = value;
                count = count + 1;
        }

        public void removeByIndex(int arg) {

                for (int i = arg + 1; i < count; i++) {
                        data[i - 1] = data[i];
                }
                data[count - 1] = null;

                count = count - 1;

        }

        public Car getByIndex(int i) {
                return data[i];
        }



}
