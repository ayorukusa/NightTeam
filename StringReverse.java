public class StringReverse {
    public static void main(String[] args) {

        String str = "Alev";
        String s = "";

        for (int i = str.length()-1 ; i>= 0; i--) {
            s += str.charAt(i);

        }
        System.out.println(s);
    }
}
