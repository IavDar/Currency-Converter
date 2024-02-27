package l31;

class MainAnonymous {
    public static void main(String[] args) {
       Calculator division = new Calculator() {

           @Override
           public int operate(int a, int b) {
               return a / b;
           }
       };

        Calculator modulus = new Calculator() {

            @Override
            public int operate (int a, int b) {
                return a % b;
            }
        };

        int result = division.operate(8, 4);
        System.out.println(" 8 / 4 = " + result);

        int result2 = modulus.operate(9, 2);
        System.out.println(" 9 % 2 = " + result2);

       }

}
