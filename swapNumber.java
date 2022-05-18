public class swapNumber {



        public static int swapNum(int a,int b){

            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a : "+a +"b : "+b );
        }
        public static void main(String[] args) {
        /*

        4  2
        2  4

        a->10  b - > 20
        a=a+b;
        b=a-b;
        a=a-b;
         */
            swapNum(5,3);

        }
    }

}
