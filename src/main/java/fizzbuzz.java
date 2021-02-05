public class fizzbuzz {



        public static void main(String[] args) {

            String fizz = "fizz";
            String buzz = "buzz";
            boolean res = true;
            int nbr;

            for (int i = 1; i <= 100; i++) {

                if (i % 3 == 0 && i % 5 == 0) {

                    System.out.print("FizzBuzz ");
                }else if (i % 5 == 0) {

                    System.out.print("Buzz ");
                }else if (i % 3 == 0) {

                    System.out.print("Fizz ");

                }else {
                    System.out.print(i + " ");

                }
                System.out.println("salut");
            }



        }


}
