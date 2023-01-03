public class Main {
    public static void main(String[] args) {
        int one = 25;
        int two = 21;
        int three = 33;
        boolean firstNumberLarger = one > two && one > three;
        if (firstNumberLarger) {
            System.out.println ("Первое число самое большее.");
        }
        boolean secondNumberLarger = two > one && two > three;
        if (secondNumberLarger) {
            System.out.println ("Второе число самое большее.");
        } else { System.out.println ("Третье число самое большее.");
        }






    }
}